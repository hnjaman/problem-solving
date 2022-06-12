package code2022.toptal;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReducePollution {
    public static int solution(int[] A){
        int finalsum = IntStream.of(A).sum();
        int sum;
        int count=0;
        if(finalsum > 0){
            finalsum = finalsum/2;
            sum = finalsum + 1;
            while(sum > finalsum){
                Arrays.sort(A);
                A[A.length-1] = A[A.length-1]/2;
                sum = IntStream.of(A).sum();
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {5,19,8,1};
//        int[] a = {10,10};
//        int[] a = {0, 0};
        System.out.println(solution(a));
    }
}
