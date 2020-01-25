package bjit;

import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class DecimalCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float input = -12.456f;
        float absinput = abs(input);
        String s = Float.toString(absinput);
        System.out.println(s);
        String[] sinput = s.split("\\.");
        System.out.println(sinput[0].length());
        //System.out.println(absinput);

//        int[] arr = new int[5];
//        System.out.println(arr.length);
    }
}
