package Bolum3;

import java.util.Scanner;

public class MultiplesFour {

    public static void main(String[] args) {
        int sum = 0, value;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz (Çıkmak için tek sayı giriniz): ");
        while ((value = input.nextInt()) % 2 == 0)
        {
            if(value % 4 == 0)
                sum += value;

            System.out.print("Bir Sayı Giriniz (Çıkmak için tek sayı giriniz): ");
        }

        System.out.println("Toplam : " + sum);
    }
}
