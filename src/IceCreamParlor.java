import java.util.Scanner;

public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for (int i = 0; i < input; i++) {
            int dollar = in.nextInt();
            int flavor = in.nextInt();
            int[] arr = new int[flavor];
            for (int j = 0; j < flavor; j++) {
                arr[j] = in.nextInt();
            }

            for (int j = 0; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[j] + arr[k]) == dollar) {
                        System.out.println((j + 1) + " " + (k + 1));
                        break;
                    }
                }
            }
        }
    }
}
