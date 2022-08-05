package AdventureGame;

public class Forest extends BattleLoc{

    public Forest(Player player) {
        super(player, "Forest","Firewood", new Vampire() ,3);
    }

    @Override
     public boolean onLocation() {
        System.out.println("You are walking in the forest. It's very dark in here and you can hear wolves.");
        System.out.println("What the! Did I see a red eye?");
        System.out.println("Here we go again! "+ this.getObstacleNumber() + " "+ this.getObstacle().getName() +"s come upon you.");

        reflex();

        return super.onLocation();
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "You must be careful. "+ this.getObstacle().getName() +"s live here.";
    }
}
