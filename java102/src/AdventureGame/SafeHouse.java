package AdventureGame;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player, "Safe House", "Health");
    }

    @Override
    public boolean onLocation() {
        System.out.println("You are in the safe house.");
        System.out.println("Your healthy is full.");
        return true;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "It gives you rest and heals you.";
    }

}
