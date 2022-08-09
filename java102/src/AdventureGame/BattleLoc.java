package AdventureGame;

import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int obstacleNumber;

    public BattleLoc(Player player, String name, String benefit, Obstacle obstacle, int maxObstacle) {
        super(player, name, benefit);
        this.obstacle = obstacle;
        this.obstacleNumber = randomObstacleNumber(maxObstacle);
    }


    @Override
    public boolean onLocation() {
        return true;
    }

    @Override
    public String getInfo() {
        return "This place is not safe for you. ";
    }

    public boolean combat(){
        System.out.print("Press '1' to fight. (Press any key to escape) : ");

        if(!input.nextLine().equals("1")){
            return false;
        }

        System.out.println("###############################################################");
        System.out.println("Take a position.");
        int i ;
        boolean isEscape = false;
        for (i = 0; i < this.obstacleNumber; i++){
            if (isEscape){
                break;
            }

            this.getPlayer().playerStats();
            System.out.println("\n"+this.getPlayer().getCharName() + "'s Health : "); this.getPlayer().printBarStats();


            if (this.getObstacle() instanceof Snake){
                this.getObstacle().setDamage(((Snake) this.getObstacle()).getRandDamage());
            }

            System.out.println();
            this.getObstacle().setHealth(this.getObstacle().getDefaultHealth());
            this.getObstacle().obstacleStats();
            System.out.println("\n"+this.getObstacle().getName() + "'s Health :"); this.getObstacle().printBarHealth();

            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0){
                System.out.print("\n<H>it or <E>scape : ");
                String select = input.nextLine().toUpperCase();

                if (select.equals("H")){
                    Random r = new Random();
                    if (r.nextBoolean()){
                        hitChar();
                        hitObstacle();
                    }
                    else {
                        hitObstacle();
                        hitChar();
                    }
                }
                else if (select.equals("E")){
                    isEscape = true;
                    break;
                }
                else {
                    System.out.println("Invalid Value! Try again.");
                }
                System.out.println();
                System.out.println(this.getPlayer().getCharName() + "'s Health : "); this.getPlayer().printBarStats();
                System.out.println(this.getObstacle().getName() + "'s Health :"); this.getObstacle().printBarHealth();

                if (this.getObstacle().getHealth() == 0){
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getMoney());
                }
            }


        }
        if ((i == this.obstacleNumber) && (this.getObstacle().getHealth() == 0) ){
            System.out.println("You killed all the enemies in this place. Added to the inventory of the reward.");
            this.getPlayer().setMoney(this.getPlayer().getMoney() + this.obstacleNumber * this.getObstacle().getMoney());
            return true;
        }

        return false;
    }

    private void hitChar(){
        if (this.getPlayer().getHealth() == 0){
            return;
        }
        System.out.println("\nYou have done "+ this.getPlayer().getTotalDamage() +" damage to the "+this.getObstacle().getName());
        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());
    }

    private void hitObstacle(){
        if (this.getObstacle().getHealth() == 0){
            return;
        }
        int damage = this.getObstacle().getDamage() - this.getPlayer().getTotalBlock();

        if (damage > 0){
            System.out.println("\nThe "+this.getObstacle().getName()+" did "+ damage +" damage to you.");
            this.getPlayer().setHealth(this.getPlayer().getHealth() - damage);
        }
        else {
            System.out.println("You blocked all the " + this.getObstacle().getName() + "s damage.");
        }

    }

    public int randomObstacleNumber(int maxObstacle){
        Random r = new Random();
        return r.nextInt(maxObstacle) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getObstacleNumber() {
        return obstacleNumber;
    }

    public void setObstacleNumber(int obstacleNumber) {
        this.obstacleNumber = obstacleNumber;
    }
}
