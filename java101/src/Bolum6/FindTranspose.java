package Bolum6;

import java.util.Arrays;

public class FindTranspose {

    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{5,6,4}};

        int[][] t = findTranspose(arr);

        System.out.println("Matris : ");
        printMatrix(arr);

        System.out.println("Transpoze : ");
        printMatrix(t);

    }

    public static int[][] findTranspose(int[][] arr){
        int[][] t = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                t[j][i] = arr[i][j];
            }
        }
        return t;
    }

    public static void printMatrix(int[][] arr){
        for (int[] x : arr){
            for (int y : x)
                System.out.print(y + "\t");
            System.out.println();
        }
    }
}
