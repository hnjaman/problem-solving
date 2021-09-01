package hackjava;

import java.util.Scanner;

public class StringReversePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        int len = (int) Math.ceil(A.length() / 2);
        for (int i = 0; i <= len; i++) {
            if (A.charAt(i) == A.charAt((A.length()) - (i + 1))) {
                count++;
            } else {
                break;
            }
        }
        if (count == len + 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
