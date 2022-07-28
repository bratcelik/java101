package Bolum6;

import java.util.Arrays;

public class FindFrequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < arr.length-1; i++){
            int index = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        System.out.println("Dizi : " + Arrays.toString(arr));
        System.out.println("Tekrar Sayilari : ");

        for (int i = 0; i < arr.length;){
            int count = 1, current = arr[i];
            while ((count + i) < arr.length && current == arr[i+count]){
                count++;
            }
            i += count;
            System.out.println(current + " sayisi " + count+" kere tekrar edildi.");
        }


    }

}
