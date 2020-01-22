package hackjava;

import java.util.Scanner;

public class StringTokensMultipleRegexSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String ss = s.trim();
        // String[] sp=s.split("_|\\.|\\s|\\,|\\!|\\,|\\?|\\'|\\@");
        int len = ss.length();
        int count = 0;
        if (len > 0) {
            String[] sp = ss.split("[-. _,!?'@]+");
            System.out.println(sp.length);
            for (int i = 0; i < sp.length; i++) {
                // count=count+sp[i].length();
                System.out.println(sp[i]);
            }
        } else {
            System.out.println(len);
        }
        scan.close();
    }
}
