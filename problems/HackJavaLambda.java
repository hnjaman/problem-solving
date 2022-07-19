package problems;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public static PerformOperation isOdd(){
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation isPrime(){
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
    }

    public static PerformOperation isPalindrome(){
        return (int a) ->  Integer.toString(a).equals( new StringBuilder(Integer.toString(a)).reverse().toString() );
    }

//    PerformOperation performOperation = new PerformOperation() {
//        @Override
//        public boolean check(int a) {
//            return false;
//        }
//    };


//    public PerformOperation isOdd(){
//        //@Override
//        return null;
//    }
//
//    public PerformOperation isPrime(){
//        //@Override
//        return null;
//    }
//
//    public PerformOperation isPalindrome(){
//        //@Override
//        return null;
//    }

//    PerformOperation isOdd() {
//        return (it) -> it%2 ? false : true;
//    }
//
//    Function<Integer, String> isPrime() {
//        return (it) -> "Hello, world: " + it;
//    }
//
//    Function<Integer, String> isPalindrome() {
//        return (it) -> "Hello, world: " + it;
//    }
}
// Write your code here

public class HackJavaLambda {

    public static void main(String[] args) throws IOException {
        MyMath myMath = new MyMath();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bufferedReader.readLine());
        PerformOperation performOperation;
        boolean result;
        String answer = null;
        while (testCase-- > 0) {
            String input = bufferedReader.readLine().trim();
            StringTokenizer stringTokenizer = new StringTokenizer(input);
            int action = Integer.parseInt(stringTokenizer.nextToken());
            int numberToCheck = Integer.parseInt(stringTokenizer.nextToken());
            if (action == 1) {
                performOperation = myMath.isOdd();
                result = myMath.checker(performOperation, numberToCheck);
                answer = (result) ? "ODD" : "EVEN";
            } else if (action == 2) {
                performOperation = myMath.isPrime();
                result = myMath.checker(performOperation, numberToCheck);
                answer = (result) ? "PRIME" : "COMPOSITE";
            } else if (action == 3) {
                performOperation = myMath.isPalindrome();
                result = myMath.checker(performOperation, numberToCheck);
                answer = (result) ? "PALINDROME" : "NOT PALINDROME";
            }
            System.out.println(answer);
        }
    }
}
