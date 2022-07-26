package Bolum3;

import java.util.Scanner;

public class DigitsSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayý giriniz : ");
        int value = input.nextInt(), sum = 0;

        while (value != 0)
        {
            sum += value % 10;
            value /= 10;
        }

        System.out.println(sum);


    }

}
