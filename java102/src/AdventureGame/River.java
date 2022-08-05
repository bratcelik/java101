package AdventureGame;

public class River extends BattleLoc{

    public River(Player player) {
        super(player, "River", "Water", new Bear(), 2);
    }

    @Override
    public boolean onLocation() {
        System.out.println("The river flows fast as if there is a monster in it.");
        System.out.println("There's a voice behind you!");
        System.out.println("Come on man, I'm tired right now. "+ this.getObstacleNumber() +
                " "+ this.getObstacle().getName() +"s come upon you.");

        reflex();

        return super.onLocation();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "You must be careful. "+ this.getObstacle().getName() +"s live here.";
    }
}
