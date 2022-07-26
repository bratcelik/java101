package Bolum4;

import java.util.Scanner;

public class PalindromeNumbers {

    static boolean isPalindrome(int value){
        int reversed = 0, remainder, original = value;

        while (value != 0)
        {
            remainder = value % 10;
            reversed = reversed * 10 + remainder;
            value /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayý giriniz : ");
        int value = input.nextInt();

        System.out.println("Sayý " + ((isPalindrome(value)) ? "palindromdur." : "palindrom deðildir."));
    }

}
