package Bolum1;

import java.util.Scanner;

public class CalcHypotenuse {
    public static void main(String[] args) {
        // Değişkenler
        int a,b;
        double c;

        // Scanner girdi için
        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.println("Hipotenüs : " +c);
    }
}
