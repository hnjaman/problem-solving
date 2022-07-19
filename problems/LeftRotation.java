package problems;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //3
        int d = in.nextInt();   //2
        int[] numbs = new int[n];

        int aa = 1;

        for (int i = 0; i < n; i++) {   //0 1 2
            if (i < d) {
                numbs[(n - d) + i] = in.nextInt();  // 3-2+0=1; 3-2+1 = 2
            } else {
                numbs[i - d] = in.nextInt();        // 2-2=0
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(numbs[i] + " ");
        }
    }
}

// 1 2 3    -> 2 3 1    -> 3 1 2    // left rotation
// 1 2 3    -> 3 1 2    -> 2 3 1    // circular/right rotation