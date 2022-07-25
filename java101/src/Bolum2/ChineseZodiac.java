package Bolum2;

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        int birthDate;

        System.out.print("Doğum yılınızı giriniz : ");
        birthDate = input.nextInt();
        birthDate %= 12;

        switch (birthDate) {
            case 0 -> result = "Maymun";
            case 1 -> result = "Horoz";
            case 2 -> result = "Köpek";
            case 3 -> result = "Domuz";
            case 4 -> result = "Fare";
            case 5 -> result = "Öküz";
            case 6 -> result = "Kaplan";
            case 7 -> result = "Tavşan";
            case 8 -> result = "Ejderha";
            case 9 -> result = "Yılan";
            case 10 -> result = "At";
            case 11 -> result = "Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz : " + result);

    }
}
