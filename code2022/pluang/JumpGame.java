package code2022.pluang;

//https://leetcode.com/problems/jump-game/

// 1. jump can be 1 to max
// 2. element can be zero

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int last = nums.length-1;
        for(int i=nums.length-1; i>=0; i--) {
            if(i + nums[i] >= last) {
                last = i;
            }
        }
        return last == 0;
    }

    public static void main(String[] args) {
        int[] array = {3,2,1,0,4};
        System.out.println(canJump(array));
    }
}
