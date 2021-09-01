package leetcode;

import java.util.ArrayList;

public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = new int[]{1, 1, 2};
        // System.out.println(array.length);
        System.out.println(removeDuplicate(array));
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
