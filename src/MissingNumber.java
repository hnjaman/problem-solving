import java.util.Arrays;

public class MissingNumber {
    //    leetcode - https://leetcode.com/problems/missing-number/

    public static int solution(int[] nums) {
        int temp = 0;
        boolean found = false;
        Arrays.sort(nums);
        if (nums.length > 0 && nums[0] > 0) {
            return 0;
        }

        for(int i = 0; i<nums.length; i++){
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

        if (found) {
            return temp;
        } else {
            return nums[nums.length - 1] + 1;
        }
    }

    public static void main (String[]args){
//        int[] nums = new int[]{7,8,9,11,12};
//        int[] nums = new int[]{1000, -1};
//        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int[] nums = new int[]{1};
        System.out.println(solution(nums));
    }
}
