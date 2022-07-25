package Bolum2;

import java.util.Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("İlk sayıyı giriniz : ");
            n1 = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            n2 = input.nextInt();
            System.out.println("\n1-Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\nÇıkmak için -1 giriniz...\n");
            System.out.print("Seçiminiz : ");
            select = input.nextInt();

            switch (select)
            {
                case -1:
                    System.out.println("Programdan çıkılıyor...");break;
                case 1:
                    System.out.println("Toplam : "+(n1+n2)); break;
                case 2:
                    System.out.println("Fark : " + (n1-n2)); break;
                case 3:
                    System.out.println("Çarpım : " + (n1*n2)); break;
                case 4:
                    if(n2 != 0){
                        System.out.println("Bölüm : " + (n1/n2)); break;
                    }
                    else{
                        System.out.println("Bir sayı 0'a bölünemez !");
                    }break;
                default:
                    System.out.println("Yanlış seçim yaptınız tekrar deneyiniz."); break;
            }
        }while (select != -1);


    }
}
