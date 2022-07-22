package Bolum1;

import java.util.Scanner;

public class CalcCircle {

    public static void main(String[] args) {
        // Variables
        int r;
        double PI = 3.14d;
        double circleCircum, circleArea;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz : ");
        r = input.nextInt();

        circleCircum = 2 * PI * r;
        circleArea = PI * r * r;

        System.out.println("Dairenin cevresi : "+ circleCircum);
        System.out.println("Dairenin alani : "+ circleArea);


    }

}
