package recursion;

import java.util.Scanner;

public class GCD {
    static int gcdGenerator(int a, int b){
        if(a==0)
            return b;
        if(b==0)
            return a;
        if(a>b)
        {
            if(a%b==0)
                return b;
            return gcdGenerator(b, a%b);
        }else{
            if(b%a==0)
                return a;
            return gcdGenerator(a,b%a);
        }
    }

    public static void main(String[] args) {

        int gcd, lcm;
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] arr = new int[input];
        for(int i=0;i<input;i++){
            arr[i]=in.nextInt();
        }

        int n = arr.length;
        gcd = gcdGenerator(arr[0], arr[1]);
        lcm=arr[0]*arr[1]/gcd;
       // System.out.println(lcm);
        for (int j = 2; j < n; j++) {
            gcd = gcdGenerator(gcd, arr[j]);
            if(lcm%arr[j]!=0) {
                lcm = lcm * arr[j] / gcd;
            }
        }

        System.out.println("GCD is "+gcd);
        System.out.println("LCM is "+lcm);
    }
}
