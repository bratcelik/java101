package Bolum1;

import java.util.Scanner;

public class TaksimetreHesapla {

    public static void main(String[] args) {
        // Değişkenler
        int mesafe;
        double tutar = 10, KM_TUTAR = 2.20d;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi giriniz(KM) : ");
        mesafe = input.nextInt();

        tutar += (mesafe * KM_TUTAR);

        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Ödenecek ücret : "+tutar);





    }
}
