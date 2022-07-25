package Bolum2;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int year = input.nextInt();
        boolean isLeap;

        if(year % 100 == 0)
            isLeap = year % 400 == 0;
        else
            isLeap = year % 4 == 0;

        System.out.println(year + "bir artık " + ((isLeap) ? "yıldır !" : "yıl değildir !"));
    }
}
