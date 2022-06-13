package code2022;

import java.util.ArrayList;
import java.util.Arrays;

public class SortEvenThenOdds {
    public static void main(String[] args) {
        int[] array = {5, 10, 4, 6, 7,2};
        Arrays.sort(array);

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            if(array[i] % 2 == 0){
                result.add(array[i]);
            } else {
                odd.add(array[i]);
            }
        }
        result.addAll(odd);

        System.out.println(result);
    }
}
