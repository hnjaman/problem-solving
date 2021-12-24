package code2021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Created by Lenovo on 8/30/2021.
 */
public class BinaryAddition {
    public static void main(String[] args) throws IOException {
        long b1, b2;

        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            String[] binaries = line.split(",");
//            b1 = Long.parseLong(binaries[0], 10);
//            b2 = Long.parseLong(binaries[1], 10);

            b1 = new Long(binaries[0]);
            b2 = new Long(binaries[1]);

            int i = 0, carry = 0;
            int[] sum = new int[10];
            while (b1 != 0 || b2 != 0) {
                sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
                carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
                b1 = b1 / 10;
                b2 = b2 / 10;
            }
            if (carry != 0) {
                sum[i++] = carry;
            }
            --i;
            while (i >= 0) {
                System.out.print(sum[i--]);
            }
            System.out.print("\n");
        }
    }
}
