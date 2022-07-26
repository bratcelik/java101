package Bolum3;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, pow , sum = 1;

        System.out.print("Tabaný giriniz : ");
        number = input.nextInt();
        System.out.print("Üssü giriniz : ");
        pow = input.nextInt();

        for (int i = 0; i < pow; i++)
        {
            sum *= number;
        }

        System.out.println("Sonuç : " + sum);
    }

}
