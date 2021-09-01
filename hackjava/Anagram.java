package hackjava;

import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        StringBuilder sf = new StringBuilder(a.toLowerCase());
        StringBuilder ss = new StringBuilder(b.toLowerCase());

        int count = 0;
        for (int i = 0; i < sf.length(); i++) {
            int j;
            for (j = 0; j < ss.length(); j++) {
                if (sf.charAt(i) == ss.charAt(j)) {
                    sf.setCharAt(i, '0');
                    ss.setCharAt(j, '0');
                    count = count + 2;
                    break;
                }
            }
        }

        int c = sf.length() + ss.length() - count;
        if (c == 0) {
            return true;
        } else {
            return false;
        }
        //return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        // System.out.println(isAnagram(a, b));
    }
}
