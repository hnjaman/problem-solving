package code2022;

import java.util.Arrays;

public class ShiftArrayElement {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        int n = 3;

        System.out.println("Original array: ");

        System.out.println(Arrays.asList(arr));

        //Rotate the given array by n times toward right
        for(int i = 0; i < n; i++){
            int j, last;
            last = arr[arr.length-1];

            for(j = arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.asList(arr));

        Integer[] array2 = {1, 2, 3, 4, 5};
        System.out.println(array2.length);
//        Integer[] array2 = {2, 3, 4, 5, 1};
//        Integer[] array2 = {3, 4, 5, 1, 2};
//        Integer[] array2 = {4, 5, 1, 2, 3};

        //Rotate the given array by n times toward left
        for(int i = 0; i<n; i++){
            int first = array2[0];

            for(int j=0; j< array2.length-1; j++){
                array2[j] = array2[j+1];
            }
            array2[array2.length-1] = first;
        }
        System.out.println(Arrays.asList(array2));
    }
}
