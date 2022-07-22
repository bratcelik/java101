package Bolum1;

import java.util.Scanner;

public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Muzik notunu giriniz : ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam/6.0;

        System.out.println("Ortalamanız : " + sonuc);

        System.out.println((sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı"));



    }


}
