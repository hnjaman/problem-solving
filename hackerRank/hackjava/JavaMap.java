package hackerRank.hackjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phonebook = new HashMap<>();
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            phonebook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            try {
                int num = phonebook.get(s);
                System.out.println(s + "=" + num);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }
    }
}
