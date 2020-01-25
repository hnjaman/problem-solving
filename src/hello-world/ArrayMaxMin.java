import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max = max(arr);
        int min = min(arr);

        System.out.println(max);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
        System.out.println(min);
    }

    public static int max(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr[arr.length-1];
    }

    public static int min(int[] arr){
        int temp=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]<arr[i+1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr[arr.length-1];
    }


}
