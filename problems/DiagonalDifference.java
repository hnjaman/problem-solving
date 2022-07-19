package problems;

import java.util.Scanner;

public class DiagonalDifference {
    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        //int diff=0;
        int a = 0;
        // int b=0;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length; i++, j--) {
            a = a + arr[i][i] - arr[j][i];
            // b=b+arr[j][i];
        }

        System.out.println(Math.abs(a));

        return Math.abs(a);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        //  scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.nextLine();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
