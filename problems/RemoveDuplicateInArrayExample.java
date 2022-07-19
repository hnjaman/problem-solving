package problems;

import java.util.Arrays;

//*** Remove Duplicate Element in Array using Temporary Array

public class RemoveDuplicateInArrayExample {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] temp = new int[n];

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = {50, 30, 20, 10, 40, 35, 50, 47};
        int length = arr.length;
        Arrays.sort(arr);
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
