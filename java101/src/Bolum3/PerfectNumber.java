package Bolum3;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value, sum;
        System.out.print("Bir say� giriniz : ");
        value = input.nextInt();
        sum = (value == 1) ? 0 : 1;

        for (int i = 2; i < value; i++)
        {
            if(value % i == 0)
                sum += i;
        }

        if(value == sum)
            System.out.println(value + " M�kemmel say�d�r");
        else
            System.out.println(value + " M�kemmel say� de�ildir");
    }



}
