package AdventureGame;

public abstract class BattleLoc extends Location{
    Obstacle obstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle) {
        super(player, name);
        this.obstacle = obstacle;
    }

    @Override
    boolean onLocation() {
        return false;
    }

    public void combat(){

    }
}
