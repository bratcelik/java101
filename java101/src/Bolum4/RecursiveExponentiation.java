package Bolum4;

import java.util.Scanner;

public class RecursiveExponentiation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,exponent;
        System.out.print("Taban deðerini giriniz : ");
        base = input.nextInt();
        System.out.print("Üs deðerini giriniz : ");
        exponent = input.nextInt();

        System.out.println(expRecursive(base,exponent));

    }

    static long expRecursive(int base, int exponent)
    {
        if(exponent == 0)
            return 1;
        return expRecursive(base,exponent-1) * base;
    }

}
