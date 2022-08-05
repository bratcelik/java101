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
                "\nDamage\t\t: "+this.getDamage()+
                "\nHealth\t\t: "+this.getHealth()+"" +
                "\nMoney\t\t: "+this.getMoney());
    }

    public void initChar(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
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
        return damage + this.inventory.getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBlock() {
        return block + this.inventory.getArmor().getBlock();
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
