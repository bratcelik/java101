package Bolum6;

import java.util.Scanner;
import java.util.Arrays;

public class FindClosestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};

        System.out.println("Dizi : " + Arrays.toString(list));

        System.out.print("Girilen Sayı : ");
        int value = input.nextInt();

        long closestLess = (long)Integer.MIN_VALUE -1;
        long closestGreater = (long)Integer.MAX_VALUE +1;


        for (int i : list) {
            if (i < value) {
                if((value - closestLess) > (value - i)){
                    closestLess = i;
                }
            }
            if (i > value) {
                if((closestGreater - value) > (i - value)){
                    closestGreater = i;
                }
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + ((closestLess != (long)Integer.MIN_VALUE -1) ? closestLess : "Bulunamadı"));
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + ((closestGreater != (long)Integer.MAX_VALUE +1) ? closestGreater : "Bulunamadı"));
    }
}

