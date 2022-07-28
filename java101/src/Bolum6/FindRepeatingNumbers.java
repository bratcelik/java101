package Bolum6;

import java.util.Arrays;

public class FindRepeatingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,5,5,3,4,4,6,7,8,8,8};
        int[] repeating = new int[arr.length/2];
        Arrays.fill(repeating,-1);
        int repeatingCount = 0;

        for (int i = 0; i < arr.length - 1; i++){
            if ((arr[i] % 2 == 0) && !(isHas(repeating,arr[i]))){
                for (int j = i+1; j < arr.length; j++){
                    if (arr[i] == arr[j]){
                        repeating[repeatingCount++] = arr[i];
                        break;
                    }
                }
            }
        }

        for (int x : repeating){
            if (x != -1)
                System.out.println(x);
        }
    }

    public static boolean isHas(int[] arr, int value){
        for (int x : arr)
            if (x == value)
                return true;
        return false;
    }
}
