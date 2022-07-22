package Bolum1;

import java.util.Scanner;

public class KdvHesapla {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar, kdvliTutar, kdvTutar, kdvOran = 0.18;

        System.out.print("Tutarı giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar* kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar : "+tutar);
        System.out.println("Kdv Oranı : " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("Kdv'li Tutar : " + kdvliTutar);

    }
}
