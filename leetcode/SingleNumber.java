package leetcode;

public class SingleNumber {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int[] nums = new int[]{2,2,4};
        for (int i : nums) {
            a |= i;
            b &= i;
            c ^= i;
        }
        System.out.println("|= "+a);
        System.out.println("&= "+b);
        System.out.println("^= "+c);
    }
}
