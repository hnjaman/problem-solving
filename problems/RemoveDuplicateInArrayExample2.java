package problems;
import java.util.Arrays;

//*** Remove Duplicate Element in Array using separate index

public class RemoveDuplicateInArrayExample2 {
    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }

        int j = 0;//for next element

        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {50, 30, 20, 10, 40, 35, 50, 47};
        int length = arr.length;
        Arrays.sort(arr);
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length+1; i++)
            System.out.print(arr[i]+" ");
    }
}
