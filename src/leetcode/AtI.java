package leetcode;

import java.util.Scanner;

public class AtI {
    private static int myAtoi(String str1) {
        String string2 = str1.trim();
        if(Character.isDigit(string2.charAt(0))){
            StringBuilder result = new StringBuilder(string2.replaceAll("[^0-9]+","").trim());
            System.out.println(result);
            return Integer.parseInt(new String(result));
        }else if(string2.charAt(0) == '-' || string2.charAt(0) == '+'){
            StringBuilder result = new StringBuilder(string2.replaceAll("[-][0-9]?","").trim());
            System.out.println(result);
            return Integer.parseInt(new String(result));
        }else
            return 0;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //String word = reader.nextLine();
        System.out.println(myAtoi("-42-"));
    }
}
