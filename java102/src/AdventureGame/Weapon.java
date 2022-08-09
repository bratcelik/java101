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
                new Weapon("Gun",1,25,2),
                new Weapon("Sword",2,35,3),
                new Weapon("Rifle",3,45,7)
        };

        return weaponList;
    }

    public int getDamage() {
        return this.damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
