package Bolum3;

import java.util.Scanner;

public class GcdLcm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val1, val2;
        int n,m;
        System.out.print("Birinci sayýyý giriniz : ");
        val1 = n = input.nextInt();
        System.out.print("Ýkinci sayýyý giriniz : ");
        val2 = m = input.nextInt();

        while (m != 0)
        {
            int temp = n % m;
            n = m;
            m = temp;
        }
        System.out.println("Ebob : " + n + "\nEkok : " + (val1*val2)/n);

    }


}
