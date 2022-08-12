package AdventureGame;

import java.util.Random;

public class Mine extends BattleLoc{
    private static boolean isFinish;

    public Mine(Player player) {
        super(player, "Mine", "Item", new Snake(), 5);
    }

    @Override
    public boolean onLocation() {
        if (isFinish){
            System.out.println("This place is complete. You can't fight here anymore.");
            return true;
        }
        System.out.println("You are walking on the mountain. There is a mine entrance here.");
        System.out.println("There is an Item Box inside. You open the box.");
        System.out.println("Sss! Snakes are everywhere!");
        System.out.println("Shit! "+ this.getObstacleNumber() + " "+ this.getObstacle().getName() +"s come upon you.");

        if (combat()){
            isFinish = true;
            getReward();
        }
        else {
            if (this.getPlayer().getHealth() == 0){
                System.out.println("You Died!");
                return false;
            }
        }

        return super.onLocation();
    }

    public void getReward(){
        Random r = new Random();
        int prob = r.nextInt(100) + 1;

        if (prob <= 45){ // No reward
            System.out.println("The box is empty. You didn't won anything.");
        }
        else if (prob <= 60){ // Guns
            prob = r.nextInt(100) + 1;
            int gunPower = this.getPlayer().getInventory().getWeapon().getDamage();
            if (prob <= 50){
                if (Weapon.weapons()[0].getDamage() > gunPower){
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[0]);
                }
                System.out.println("You won a Gun!");
            }
            else if (prob <= 80){
                if (Weapon.weapons()[1].getDamage() > gunPower){
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[1]);
                }
                System.out.println("You won a Sword!");
            }
            else {
                if (Weapon.weapons()[2].getDamage() > gunPower){
                    this.getPlayer().getInventory().setWeapon(Weapon.weapons()[2]);
                }
                System.out.println("You won a Rifle!");
            }
        }
        else if (prob <= 75){ // Armors
            prob = r.nextInt(100) + 1;
            int blokPower = this.getPlayer().getInventory().getArmor().getBlock();
            System.out.println(blokPower);
            if (prob <= 50){
                if (Armor.armors()[0].getBlock() > blokPower){
                    this.getPlayer().getInventory().setArmor(Armor.armors()[0]);
                }
                System.out.println("You won a Light Armor");
            }
            else if (prob <= 80){
                if (Armor.armors()[1].getBlock() > blokPower){
                    this.getPlayer().getInventory().setArmor(Armor.armors()[1]);
                }
                System.out.println("You won a Medium Armor");
            }
            else {
                if (Armor.armors()[2].getBlock() > blokPower){
                    this.getPlayer().getInventory().setArmor(Armor.armors()[2]);
                }
                System.out.println("You won a Heavy Armor");
            }
        }
        else{ // Money
            prob = r.nextInt(100) + 1;
            if (prob <= 50){
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                System.out.println("You earned 1 coins");
            }
            else if (prob <= 30){
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                System.out.println("You earned 5 coins");
            }
            else {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                System.out.println("You earned 10 coins");
            }
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "You must be careful. "+ this.getObstacle().getName() +"s live here.";
    }

    public static boolean isIsFinish() {
        return isFinish;
    }

    public static void setIsFinish(boolean isFinish) {
        Mine.isFinish = isFinish;
    }
}
