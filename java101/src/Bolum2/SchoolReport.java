package Bolum2;

import java.util.Scanner;

public class SchoolReport {

    public static void main(String[] args) {
        int math, phys, turkish, chem, music;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        math = (math = input.nextInt()) < 101 && math > -1 ? math : 0;
        System.out.print("Fizik notunuzu giriniz : ");
        phys = (phys = input.nextInt()) < 101 && phys > -1 ? phys : 0;
        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = (turkish = input.nextInt()) < 101 && turkish > -1 ? turkish : 0;
        System.out.print("Kimya notunuzu giriniz : ");
        chem = (chem = input.nextInt()) < 101 && chem > -1 ? chem : 0;
        System.out.print("Müzik notunuzu giriniz : ");
        music = (music = input.nextInt()) < 101 && music > -1 ? music : 0;
        average = (math + phys + turkish + chem + music) / 5.0;

        if(average < 55)
        {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
        }
        else
        {
            System.out.println("Tebrikler, sınıfı geçtiniz !");
        }

        System.out.println("Ortalamanız : " + average);
    }
}
