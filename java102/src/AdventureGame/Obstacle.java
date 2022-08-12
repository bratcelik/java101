package AdventureGame;

public abstract class Obstacle {
    private String name;
    private int ID;
    private int damage;
    private int health;
    private int defaultHealth;
    private int money;

    public Obstacle(String name, int ID, int damage, int defaultHealth, int money) {
        this.name = name;
        this.ID = ID;
        this.damage = damage;
        this.defaultHealth = defaultHealth;
        this.health = defaultHealth;
        this.money = money;
    }

    public void obstacleStats(){
        System.out.println("=== Enemy Stats ===");
        System.out.println("Health\tDamage\tMoney");
        System.out.println("------\t------\t-----");
        System.out.printf("%-6d\t%-6d\t%-5d\n",
                this.getHealth(),
                this.getDamage(),
                this.getMoney());
    }

    public void printBarHealth(){
        System.out.print("< ");
        for (int j = 0; j < 10; j++){
            if(j < this.getHealth()*10/this.getDefaultHealth()){
                System.out.print("+");
            }
            else{
                System.out.print("-");
            }
        }
        System.out.println(" >");
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
        if (health >= 0)
            this.health = health;
        else
            this.health = 0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}
