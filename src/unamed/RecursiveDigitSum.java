package unamed;

import java.math.BigInteger;
import java.util.Scanner;

public class RecursiveDigitSum {

    static int result;

    static BigInteger super_digit(String string, int p) {

        BigInteger sum = BigInteger.valueOf(0);
        int len = string.length();
        char[] chars = string.toCharArray();
        int lenc = chars.length;
        if (p > 1) {
            for (int i = 0; i < chars.length; i++)
                sum = sum.add(BigInteger.valueOf(Character.getNumericValue(chars[i])));
            sum = sum.multiply(BigInteger.valueOf(p));
        } else {
            for (int i = 0; i < chars.length; i++)
                sum = sum.add(BigInteger.valueOf(Character.getNumericValue(chars[i])));
        }

        if (sum.toString().length() > 1)
            return super_digit(sum.toString(), 1);
        else
            return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();
        int times = in.nextInt();
        //System.out.println(number);
        if (number.length() >= 1 && times > 1) {
            System.out.println(super_digit(number, times));
        } else {
            System.out.println(number);
        }

    }
}
