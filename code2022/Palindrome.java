package code2022;

public class Palindrome {
    public static void checkPalindrome(String text) {
//        String reverse = new StringBuilder(text).reverse().toString();
        char[] chars = text.toCharArray();
        char[] reverseChars = new char[chars.length];
        int j = 0;
        for(int i=chars.length-1; i>=0; i--){
            reverseChars[j] = chars[i];
            j++;
        }

        String reverseString = new String(reverseChars);

        if(text.equalsIgnoreCase(reverseString)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean checkPalindromeRemovingSpecialChar(String word) {
        String alphaWord = word.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(alphaWord);
        String reverse = new StringBuilder(word.replaceAll("[^a-zA-Z0-9]", "")).reverse().toString();
        System.out.println(reverse);
        if(alphaWord.equalsIgnoreCase(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        // interview
        checkPalindrome("radar");

        // turing pblm
        System.out.println(checkPalindromeRemovingSpecialChar("ad*a"));
    }
}
