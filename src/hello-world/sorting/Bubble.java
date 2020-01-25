package sorting;

public class Bubble {
    static void bubbleSort(int[] arr) {
        int temp = 0;
        for(int i=0; i < arr.length; i++){              // O(n)
            for(int j=i+1; j < arr.length; j++){        // O(n)
                if(arr[j] < arr[i]){
                    temp = arr[i];                      //swap elements
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] ={9,14,3,2,43,11,58,22};
        System.out.println("Array Before sorting.Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array After sorting.Bubble Sort");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}