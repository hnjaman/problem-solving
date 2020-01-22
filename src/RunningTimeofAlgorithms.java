import java.util.Scanner;

public class RunningTimeofAlgorithms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = in.nextInt();
        }

        int count = 0;

        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
                count++;
            }
            arr[i + 1] = key;
        }

        System.out.println(count);
    }
}
