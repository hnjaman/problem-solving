package bjit;

import java.util.ArrayList;
import java.util.LinkedList;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i=0; i<a.length; i++){
            if(a[i]%2==0)
                even.add(a[i]);
            else
                odd.add(a[i]);
        }
        LinkedList<Integer> full =new LinkedList<>();
        full.addAll(odd);
        full.addAll(even);
        odd.addAll(even);
        System.out.println(odd+" "+even);
        System.out.println(full);
        System.out.println(odd);
    }
}
