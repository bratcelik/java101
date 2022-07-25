package Bolum2;

import java.util.Scanner;

public class FlightTicket {

    public static void main(String[] args) {
        int distance, age, returnType;
        double sumPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        returnType = input.nextInt();

        if(age < 1 || !(returnType == 1 || returnType == 2) || distance < 1)
        {
            System.out.println("\nHatalı Veri Girdiniz !");
        }
        else
        {
            sumPrice = distance/10.0;

            if(age < 12)
                sumPrice /= 2;
            else if(age < 25)
                sumPrice *= 0.9;
            else if(age > 65)
                sumPrice *= 0.7;

            if(returnType == 2)
                sumPrice = sumPrice * 2 *0.8;

            System.out.println("\nToplam Tutar : " + sumPrice + " TL");
        }






    }
}
