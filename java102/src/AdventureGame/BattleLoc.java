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

    public void combat(){
        System.out.println("Take a position.");
        for (int i = 0; i < this.obstacleNumber; i++){

        }
    }

    public void reflex(){
        System.out.print("Press '1' to fight. (Press any key to escape) : ");
        String select = input.nextLine();

        if(select.equals("1")){
            // To fight
            combat();
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
