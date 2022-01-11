package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {1, 2, 6};
        merge(nums1, nums1.length-nums2.length, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int k = 0; k < nums2.length; k++) {
            if (m == 0)
                nums1[k] = nums2[k];
            else
                nums1[m + k] = nums2[k];
        }
//        for (int i = 0; i < nums1.length; i++) {
//            int temp;
//            for (int j = 0; j < nums1.length - 1; j++) {
//                if (nums1[j] > nums1[j + 1]) {
//                    temp = nums1[j + 1];
//                    nums1[j + 1] = nums1[j];
//                    nums1[j] = temp;
//                }
//            }
//        }

        Arrays.sort(nums1);
    }
}
