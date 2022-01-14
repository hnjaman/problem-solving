package code2022.zalandoCodility;

import java.util.Arrays;

/**
 * Created by Lenovo on 14/01/2022.
 */
public class MissingInteger {
    public static int solution(int[] A){
        int min = 1;
        Arrays.sort(A);
        for(int i=0; i<A.length; i++){
            if(A[i]==min)
                min = min + 1;
        }
        return min;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(nums1));
    }
}
