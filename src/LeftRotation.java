import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a[] = new int[n];

        int aa = 1;

        for (int i = 0; i < n; i++) {
            if (i < d) {
                a[(n - d) + i] = in.nextInt();
            } else {
                a[i - d] = in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}