package Bolum3;

import java.util.Scanner;

public class HarmonicSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N deðerini giriniz : ");
        int value = input.nextInt();
        double sum = 0d;

        for (int i = 1; i <= value; i++)
            sum += 1d/i;

        System.out.println("Sonuç : " + sum);
    }

}
