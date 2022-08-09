package AdventureGame;

public class Forest extends BattleLoc{
    private static boolean isFinish;

    public Forest(Player player) {
        super(player, "Forest","Firewood", new Vampire() ,3);
    }

    @Override
     public boolean onLocation() {
        if (isFinish){
            System.out.println("This place is complete. You can't fight here anymore.");
            return true;
        }
        System.out.println("You are walking in the forest. It's very dark in here and you can hear wolves.");
        System.out.println("What the! Did I see a red eye?");
        System.out.println("Here we go again! "+ this.getObstacleNumber() + " "+ this.getObstacle().getName() +"s come upon you.");

        if (combat()){
            isFinish = true;
        }
        else {
            if (this.getPlayer().getHealth() == 0){
                System.out.println("You Died!");
                return false;
            }
        }

        return super.onLocation();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "You must be careful. "+ this.getObstacle().getName() +"s live here.";
    }

    public static boolean isIsFinish() {
        return isFinish;
    }

    public static void setIsFinish(boolean isFinish) {
        Forest.isFinish = isFinish;
    }
}
