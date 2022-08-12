package AdventureGame;

public abstract class NormalLoc extends Location{


    public NormalLoc(Player player, String name, String benefit) {
        super(player, name, benefit);
    }

    @Override
    public boolean onLocation() {
        return true;
    }

    @Override
    public String getInfo(){
        return "This place is safe for you. ";
    }
}
