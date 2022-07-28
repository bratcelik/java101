package Bolum6;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        int size;
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu : ");
        size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print(i+1 + ". Elemani giriniz : ");
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < size-1; i++){
            int index = i;
            for (int j = i+1; j < size; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        System.out.println("Siralama : "+ Arrays.toString(arr));
    }

}
