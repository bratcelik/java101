package Bolum3;

import java.util.Scanner;

public class MultiplesTwelve {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz : ");
        int value = input.nextInt();
        int sum = 0;

        for(int i = 1; i <= value/12; sum += 12 * i++);

        System.out.println("3 ve 4'e bölünen sayıların ortalaması : " + sum / ((value/12 == 0) ? 1 : value/12));
    }
}
