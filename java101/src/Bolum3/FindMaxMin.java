package Bolum3;

import java.util.Scanner;

public class FindMaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, value ,max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        System.out.print("Kaç tane sayý gireceksiniz : ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            System.out.print(i + ". Sayýyý giriniz : ");
            value = input.nextInt();

            if (value < min)
                min = value;
            if (value > max)
                max = value;
        }

        System.out.println("En büyük sayý: " + max + "\nEn küçük sayý: " + min);




    }

}
