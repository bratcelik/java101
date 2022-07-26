package Bolum4;

import java.util.Scanner;

public class RecursivePrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayý Giriniz : ");
        int value = input.nextInt();

        System.out.println(value + " sayýsý ASAL" + ((isPrime(value,2)) ? "DIR !" : " deðildir !"));
    }

    static boolean isPrime(int value, int count)
    {
        if(count*count <= value)
            return (value % count != 0) && (isPrime(value,count+1));
        return true;
    }
}
