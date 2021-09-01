package code2021;

import java.util.Arrays;

public class RotateArray {

    static void ArrayRotation(int[] arr, int length) {
        int temp;
        for(int i=0;i<length/2;i++){
            temp=arr[i];
            arr[i]=arr[length-1-i];
            arr[length-1-i]=temp;
        }
    }

//    [50, 30, 20, 10, 40, 35, 47, 51]
//    ->
//    [51, 47, 35, 40, 10, 20, 30, 50]

    public static void main(String[] args) {
        int arr[]={50, 30, 20, 10, 40, 35, 47, 51};
        System.out.println(Arrays.toString(arr));
        int length=arr.length;
        ArrayRotation(arr,length);
        System.out.println(Arrays.toString(arr));
    }
}
