
import java.util.Scanner;

/*  Input:  cde
            abc

    output: 4
    # removed d,e,a,b this 4
*/
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        StringBuilder firstString = new StringBuilder(first);
        StringBuilder secondString = new StringBuilder(second);

        int count = 0;
        for (int i = 0; i < firstString.length(); i++) {
            int j;
            for (j = 0; j < secondString.length(); j++) {
                if (firstString.charAt(i) == secondString.charAt(j)) {
                    firstString.setCharAt(i, '0');
                    secondString.setCharAt(j, '0');
                    count = count + 2;
                    break;
                }
            }
        }
        return firstString.length() + secondString.length() - count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
