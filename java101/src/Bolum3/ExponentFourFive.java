package Bolum3;

import java.util.Scanner;

public class ExponentFourFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;

        System.out.print("Bir Sayý Giriniz : ");
        value = input.nextInt();

        for(int i = 1, j = 1, count = 0; i < value; i *= 4, j *= 5, count++)
        {
            System.out.println("4 'ün "+ count +". kuvveti : " + i);
            if(j <= value)
                System.out.println("5 'in "+ count +". kuvveti : " + j);

        }



    }
}
