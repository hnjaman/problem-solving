package leetcode;

public class RemoveElements {
    public static void main(String[] args) {
        int[] array = new int[10];
        array = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
         System.out.println(array.length);
        System.out.println(removeElement(array, 2));
    }

    private static int removeElement(int[] array, int element) {
//        if(array.length==0 || array.length==1)
//            return array.length;
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == element && j == array.length - 1) {
                    array[i] = -1;
                    k++;
                    return array.length - k;
                } else if (array[i] == element && j != array.length - 1) {
                    array[i] = array[j + 1];
                    k++;
                }
            }
        }
        return array.length - k;
    }
}
