package AdventureGame;

public class Weapon extends Tool{
    private String name;
    private int ID;
    private int damage;
    private int price;

    public Weapon(String name, int ID, int price, int damage) {
        super(name, ID, price);
        this.damage = damage;
    }


    public static Weapon[] weapons(){
        Weapon[] weaponList = {
                new Weapon("Gun",1,2,25),
                new Weapon("Sword",2,3,35),
                new Weapon("Rifle",3,7,45)
        };

        return weaponList;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
