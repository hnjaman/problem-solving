import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class StringReductions {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();

        char[] chars = input.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());

    }
}
