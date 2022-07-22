package Bolum1;

import java.util.Scanner;

public class GreengrocerCashRegister {

    public static void main(String[] args) {
        //Variables
        double pear = 2.14d, apple = 3.67d, tomato = 1.11d, banana = 0.95d, aubergine = 5, sum = 0;
        int bag;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç kilo ? : ");
        bag = input.nextInt();
        sum += bag*pear;
        System.out.print("Elma Kaç kilo ? : ");
        bag = input.nextInt();
        sum += bag*apple;
        System.out.print("Domates Kaç kilo ? : ");
        bag = input.nextInt();
        sum += bag*tomato;
        System.out.print("Muz Kaç kilo ? : ");
        bag = input.nextInt();
        sum += bag*banana;
        System.out.print("Patlıcan Kaç kilo ? : ");
        bag = input.nextInt();
        sum += bag*aubergine;

        System.out.println("Toplam Tutar : "+sum);


    }
}
