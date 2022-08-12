package AdventureGame;

public class Armor extends Tool {
    private String name;
    private int ID;
    private int block;
    private int price;

    public Armor(String name, int ID, int price, int block) {
        super(name, ID, price);
        this.block = block;
    }


    public static Armor[] armors(){
        Armor[] armorList = {
                new Armor("Light Armor",1,15,1),
                new Armor("Medium Armor",2,25,3),
                new Armor("Heavy Armor",3,40,5)
        };
        return armorList;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }
}
