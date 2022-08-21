package AdventureGame;

import java.util.Scanner;

public abstract class Location {
    public static Scanner input = new Scanner(System.in);
    private Player player;
    private String name;
    private String benefit;

    public Location(Player player, String name, String benefit) {
        this.player = player;
        this.name = name;
        this.benefit = benefit;
    }

    abstract public String getInfo();


    abstract public boolean onLocation();

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
}
