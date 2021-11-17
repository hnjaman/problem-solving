package leetcode;

//    26. Remove Duplicates from Sorted Array
//    Input: nums = [1,1,2]
//    Output: 2, nums = [1,2,_]
//    Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//    It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.Arrays;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 2};
        // System.out.println(array.length);
        System.out.println(Arrays.toString(array));
        System.out.println(removeDuplicate(array));
        System.out.println(Arrays.toString(array));
    }

    private static int removeDuplicate(int[] array) {
        if (array.length == 0 || array.length == 1)
            return array.length;
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
    }
}
