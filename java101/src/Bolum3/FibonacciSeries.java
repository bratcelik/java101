package Bolum3;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayýsýný girin : ");
        int n = input.nextInt();

        int a = 0,b = 1;
        for (int i = 0; i < n; i++)
        {
            System.out.println(a);
            b = b + a;
            a = b - a;
        }
    }

}
