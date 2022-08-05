package AdventureGame;

public class Cave extends BattleLoc{

    public Cave(Player player) {
        super(player, "Cave", "Food", new Zombie(), 3);
    }

    @Override
    public boolean onLocation() {
        System.out.println("A cave is visible behind the trees.");
        System.out.println("This cave is very quiet. It's like no one has been here for years.");
        System.out.println("GOD DAMN IT! "+ this.getObstacleNumber() + " "+ this.getObstacle().getName() +"s come upon you.");

        reflex();

        return super.onLocation();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "You must be careful. "+ this.getObstacle().getName() +"s live here.";
    }

}
