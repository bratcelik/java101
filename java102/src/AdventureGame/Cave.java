package AdventureGame;

public class Cave extends BattleLoc{
    private static boolean isFinish;

    public Cave(Player player) {
        super(player, "Cave", "Food", new Zombie(), 3);
    }

    @Override
    public boolean onLocation() {
        if (isFinish){
            System.out.println("This place is complete. You can't fight here anymore.");
            return true;
        }
        System.out.println("A cave is visible behind the trees.");
        System.out.println("This cave is very quiet. It's like no one has been here for years.");
        System.out.println("GOD DAMN IT! "+ this.getObstacleNumber() + " "+ this.getObstacle().getName() +"s come upon you.");

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
        Cave.isFinish = isFinish;
    }
}
