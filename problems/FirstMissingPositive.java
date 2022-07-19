package problems;

import java.util.Arrays;

public class FirstMissingPositive {
//    leetcode - https://leetcode.com/problems/first-missing-positive/
//    codility - MissingInteger

    public static int solution(int[] nums) {
        int temp = 0;
        boolean found = false;
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            } else {
                if (temp != 0) {
                    if (temp == nums[i]) {
                        continue;
                    } else if ((temp + 1) != nums[i]) {
                        temp = temp + 1;
                        found = true;
                        break;
                    } else {
                        temp = nums[i];
                    }
                } else {
                    if (nums[i] > 1) {
                        temp = 1;
                        found = true;
                        break;
                    } else {
                        temp = nums[i];
                    }
                }
            }
        }

        if (found) {
            return temp;
        } else if (nums[nums.length - 1] <= 0) {
            return 1;
        } else {
            return nums[nums.length - 1] + 1;
        }
    }
    public static void main (String[]args){
//        int[] nums = new int[]{7,8,9,11,12};
//        int[] nums = new int[]{1000, -1};
//        int[] nums = new int[]{3,4,-1,1};
        int[] nums = new int[]{};
        System.out.println(solution(nums));
    }
}
