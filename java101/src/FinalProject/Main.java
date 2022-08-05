package FinalProject;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 19; i++){
            System.out.println(FirstFactorial(i));
        }
        //MineSweeper m1 = new MineSweeper();
        //m1.run();

    }

    public static long FirstFactorial(long num) {
        // code goes here
        if (num == 1)
            return 1;

        return num * (FirstFactorial(num-1));
    }
}
