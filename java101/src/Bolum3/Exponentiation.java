package Bolum3;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, pow , sum = 1;

        System.out.print("Taban� giriniz : ");
        number = input.nextInt();
        System.out.print("�ss� giriniz : ");
        pow = input.nextInt();

        for (int i = 0; i < pow; i++)
        {
            sum *= number;
        }

        System.out.println("Sonu� : " + sum);
    }

}
