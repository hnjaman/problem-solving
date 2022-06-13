import java.util.HashMap;
import java.util.HashSet;

public class ArrayPair {

    public static int[] getSumPair(int[] arrayNumbers, int sum){
        int[] resultPair = new int[2];

        for(int i=0; i<=arrayNumbers.length-1; i++){     // 0, -1, 2, 4          i = 2
            for(int j=i+1; j<=arrayNumbers.length-1; j++){                          //j= 0,1,2,4     // //(4)+(2) == 6
                if(arrayNumbers[i]+arrayNumbers[j]==sum){
                    resultPair[0] = arrayNumbers[i];
                    resultPair[1] = arrayNumbers[j];
                    break;
                }
            }
        }
        return resultPair;
    }

    static void printpairs(int arr[], int sum) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (hashSet.contains(temp)) {
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
            }
            if(hashMap.containsKey(temp)){
                System.out.println("Pair with given sum " + sum + " is (" + hashMap.get(temp) + ", " + i + ")");
            }
            hashMap.put(arr[i], i);
            hashSet.add(arr[i]);
        }
    }

    public static void main(String[] args) {
//        int[] arrayNumbers = {0,-1,2,4};
        int[] arrayNumbers = {0,1,4,3,5};
//        int[] resultPair = getSumPair(arrayNumbers, 8);
//        System.out.println(resultPair[0]);
//        System.out.println(resultPair[1]);
        printpairs(arrayNumbers, 7);
    }
}
