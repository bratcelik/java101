package AdventureGame;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player, "Safe House");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the safe house.");
        System.out.println("Your healthy is full.");
        return true;
    }

    public String getInfo(){
        return super.getInfo() + "It gives you rest and heals you.";
    }
}
