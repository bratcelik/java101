package Bolum2;

import java.util.Scanner;

public class ConditionalSort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Birinci sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("Üçüncü sayıyı giriniz : ");
        c = input.nextInt();

        if(a > b)
        {
            if(a > c)
            {
                System.out.println("a > "+ ((b > c) ? "b > c" : "c > b"));
            }
            else
            {
                System.out.println("c > a > b");
            }
        }
        else if(b > c)
        {
            System.out.println("b > "+ ((a > c) ? "a > c" : "c > a"));
        }
        else
        {
            System.out.println("c > "+ ((a > b) ? "a > b" : "b > a"));
        }
    }
}
