package leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    private int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i<nums.length; i++){
                int complement = target - nums[i];
                if(map.containsKey(complement)){
                    return new int[] {map.get(complement),i};
                }
                map.put(nums[i], i);
            }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] array = {11,2,7,15};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(array, 9);
        System.out.println(result[0]+"-"+result[1]);
    }
}
