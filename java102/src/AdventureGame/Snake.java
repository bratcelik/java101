package AdventureGame;

import java.util.Random;

public class Snake extends Obstacle{

    public Snake() {
        super("Snake", 4, 3, 12, 0);
        //this.setDamage(this.getDefaultHealth());
    }

    public int getRandDamage(){
        Random r = new Random();
        return r.nextInt(3) + 3;
    }

}
