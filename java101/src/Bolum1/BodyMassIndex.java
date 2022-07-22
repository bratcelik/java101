package Bolum1;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {
        // Variables
        double height, weight, BmiIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        weight = input.nextDouble();

        BmiIndex = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz : " + BmiIndex);


    }
}
