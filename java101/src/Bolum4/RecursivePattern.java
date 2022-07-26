package Bolum4;

import java.util.Scanner;

public class RecursivePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayýsý : ");
        int n = input.nextInt();

        foo(n);

    }

    static void foo(int n)
    {
        if(n < 1)
        {
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        foo(n-5);
        System.out.print(n + " ");
    }

}
