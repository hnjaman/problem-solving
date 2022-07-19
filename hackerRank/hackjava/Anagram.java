package hackerRank.hackjava;

import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String a, String b) {
        StringBuilder stringBuilderFirst = new StringBuilder(a.toLowerCase());
        StringBuilder stringBuilderSecond = new StringBuilder(b.toLowerCase());

        int count = 0;
        for (int i = 0; i < stringBuilderFirst.length(); i++) {
            for (int j = 0; j < stringBuilderSecond.length(); j++) {
                if (stringBuilderFirst.charAt(i) == stringBuilderSecond.charAt(j)) {
                    stringBuilderFirst.setCharAt(i, '0');
                    stringBuilderSecond.setCharAt(j, '0');
                    count = count + 2;
                    break;
                }
            }
        }

        int c = stringBuilderFirst.length() + stringBuilderSecond.length() - count;
        if (c == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
