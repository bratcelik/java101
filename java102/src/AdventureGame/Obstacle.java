package AdventureGame;

public abstract class Obstacle {
    private String name;
    private int ID;
    private int damage;
    private int health;

    public Obstacle(String name, int ID, int damage, int health) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
