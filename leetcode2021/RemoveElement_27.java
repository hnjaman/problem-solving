package leetcode2021;

import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        System.out.println(removeElement(array, 2));
    }

    private static int removeElement(int[] array, int element) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                array[i] = 101;
                k++;
            }
        }
        Arrays.sort(array);
        return array.length - k;
    }
}
