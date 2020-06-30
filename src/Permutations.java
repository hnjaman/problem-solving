import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> list=new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        helper(new ArrayList<>(), nums);
        return list;
    }
    public static void helper(List<Integer> temp, int[] nums){
        if(temp.size()==nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                helper(temp, nums);
                temp.remove(temp.size()-1); // Since we have generated the permutations with nums[i], remove it from current window
            }
        }
    }
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3};
        System.out.println(permute(num));
    }
}
