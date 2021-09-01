package hackjava;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);
        System.out.println(sum);
        System.out.println(mul);
    }
}
