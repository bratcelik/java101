package Bolum3;

import java.util.Scanner;

public class PrintDiamonds {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin boyunu giriniz : ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n-1-i; j++)
                System.out.print(" ");

            for (int j = 0; j < (2*i) + 1; j++)
                System.out.print("*");

            System.out.println();
        }

        for(int i = (n-1); i > 0; i--)
        {
            for(int j = n-i; j > 0; j--)
                System.out.print(" ");

            for (int j = 2*i - 1; j > 0; j--)
                System.out.print("*");

            System.out.println();
        }
    }

}

/*
n = 3
  *
 ***
*****

*
* */