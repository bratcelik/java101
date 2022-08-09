package AdventureGame;

import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private final Scanner input = new Scanner(System.in);
    private String name;
    private String charName;
    private int damage;
    private int block;
    private int health;
    private int money;
    private int defaultHealth;

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};

        System.out.println("Game Characters:");
        do {
            System.out.println("ID\tCharacter Name\tDamage\tHealth\tMoney");
            System.out.println("--\t--------------\t------\t------\t-----");
            for (GameChar aChar : charList) {
                System.out.printf("%-1d\t%-14s\t%-6d\t%-6d\t%-5d\n",
                        aChar.getID(),
                        aChar.getName(),
                        aChar.getDamage(),
                        aChar.getHealth(),
                        aChar.getMoney());
            }
            System.out.print("\nPlease select a Character ID : ");
            int selectChar = input.nextInt();

            if (selectChar > 0 && selectChar <= charList.length){
                System.out.println("Good choice!");
                initChar(charList[selectChar-1]);
                break;
            }
            else {
                System.out.println("Invalid Value! Try again.");
            }
        }while (true);

        printCharacterInfo();

    }



    public void printCharacterInfo(){
        System.out.println("Char Name\t: " + this.getCharName()+
                "\nDamage\t\t: "+this.getTotalDamage()+
                "\nHealth\t\t: "+this.getHealth()+"" +
                "\nMoney\t\t: "+this.getMoney());
    }

    public void initChar(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.defaultHealth = gameChar.getHealth();
    }

    public void playerStats(){
        System.out.println("\t\t====== Character Stats ======");
        System.out.println("Health\tWeapon\tDamage\t   Armor   \tBlock\tMoney");
        System.out.println("------\t------\t------\t-----------\t-----\t-----");
        System.out.printf("%-6d\t%-6s\t%-6d\t%-11s\t%-5d\t%-5d\n",
                this.getHealth(),
                this.getInventory().getWeapon().getName(),
                this.getTotalDamage(),
                this.getInventory().getArmor().getName(),
                this.getTotalBlock(),
                this.getMoney());

    }

    public void printBarStats(){
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

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public int getDamage() {
        return damage;
    }

    public int getTotalDamage(){return damage + this.inventory.getWeapon().getDamage();}

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBlock() {
        return this.block;
    }

    public int getTotalBlock(){return this.block + this.inventory.getArmor().getBlock();}

    public void setBlock(int block) {
        this.block = block;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(health, 0);
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
