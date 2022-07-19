package problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> list = new ArrayList<>();
    public static List<List<Integer>> permute(int[] numbs) {
        helper(new ArrayList<>(), numbs);
        return list;
    }
    public static void helper(List<Integer> temp, int[] numbs){
        if(temp.size()==numbs.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int numb : numbs) {
            if (!temp.contains(numb)) {
                temp.add(numb);
                helper(temp, numbs);
                temp.remove(temp.size() - 1); // Since we have generated the permutations with numbs[i], remove it from current window
            }
        }
    }
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        System.out.println(permute(num));
    }
}
