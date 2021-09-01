package turing;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        String alphaWord = word.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(alphaWord);
        String reverse = new StringBuffer(word.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString();
        System.out.println(reverse);
        if(alphaWord.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = "";
        System.out.println(isPalindrome(word));
    }
//    public static boolean isPalindrome(int word) {
//        String reverse = new StringBuffer(String.valueOf(word)).reverse().toString();
//        return String.valueOf(word).equalsIgnoreCase(reverse);
//    }
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        int word = reader.nextInt();
//        System.out.println(isPalindrome(word));
//    }
//    public static boolean isPalindrome(String word) {
//        String reverse = new StringBuffer(word).reverse().toString();
//        if(word.equalsIgnoreCase(reverse))
//            return true;
//        else
//            return false;
//    }
//    public static void main(String[] args) {
//        Scanner reader = new Scanner(System.in);
//        String word = reader.nextLine();
//        System.out.println(isPalindrome(word));
//    }
}