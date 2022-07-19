package hackerRank.hackjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> l = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            l.add(in.nextInt());
        }

        int q = in.nextInt();
        in.nextLine();

        while (q-- != 0) {
            int index;
            String s = in.next();
            if (s.equals("Insert")) {
                index = in.nextInt();
                int value = in.nextInt();
                l.add(index, value);
            }
            if (s.equals("Delete")) {
                index = in.nextInt();
                l.remove(index);
            }
        }

        for (Integer e : l) {
            System.out.print(e + " ");
        }
    }
}
