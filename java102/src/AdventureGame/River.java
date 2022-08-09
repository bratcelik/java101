package AdventureGame;

public class River extends BattleLoc{
    private static boolean isFinish;

    public River(Player player) {
        super(player, "River", "Water", new Bear(), 2);
    }

    @Override
    public boolean onLocation() {
        if (isFinish){
            System.out.println("This place is complete. You can't fight here anymore.");
            return true;
        }
        System.out.println("The river flows fast as if there is a monster in it.");
        System.out.println("There's a voice behind you!");
        System.out.println("Come on man, I'm tired right now. "+ this.getObstacleNumber() +
                " "+ this.getObstacle().getName() +"s come upon you.");

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
        River.isFinish = isFinish;
    }
}
