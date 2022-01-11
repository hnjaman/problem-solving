package code2022;

import java.util.HashSet;

public class ContainsDuplicate_217 {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
//            boolean result = set.add(num);        // Best
//            if(!result){
//                return true;
//            }

//            if(set.contains(num)){                // not good solution
//                return true;
//            }
//            set.add(num);
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int first;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            boolean result = set.add(num);        // Best
            if(!result){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsNearbyDuplicate(nums,3));
    }
}
