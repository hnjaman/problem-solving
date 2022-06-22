package code2022;

public class Palindrome {
    public static void main(String[] args) {
        String text = "radar";
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
}
