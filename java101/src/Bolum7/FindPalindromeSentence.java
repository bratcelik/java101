package Bolum7;

import java.util.Locale;

public class FindPalindromeSentence {

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("Never a foot too far - even"));
        System.out.println(isPalindrome("Anne - I vote more cars race Rome-to-Vienna"));
        System.out.println(isPalindrome("Too hot to hoot"));
        System.out.println(isPalindrome("not a palindrome"));
        System.out.println(isPalindrome("Nurse! I spy gypsies - run!"));
        System.out.println(isPalindrome("No word~ no bond~ row on"));
        System.out.println(isPalindrome("Sir{} I am not Iris!"));
        System.out.println(isPalindrome("radars belong underwater"));
        System.out.println(isPalindrome("A war at Tarawa!"));
    }

    public static boolean isPalindrome(String str){
        Locale TURKISH = Locale.forLanguageTag("tr");
        String pattern = "[^a-zA-Z]+";
        String original = str.replaceAll(pattern,"").toLowerCase(TURKISH);
        String reverse = new StringBuilder(original).reverse().toString().toLowerCase(TURKISH);

        return original.equals(reverse);
    }

}
