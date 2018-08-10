package hackjava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        Set<String> left=new HashSet<>(t);
        Set<String> right =new HashSet<>(t);
        int size;

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        for (int i = 0; i < t; i++) {
            left.add(pair_left[i]);
            right.add(pair_right[i]);
            if(left.size()>right.size()){
                System.out.println(left.size());
            }else if(right.size()>left.size()){
                System.out.println(right.size());
            }else{
                System.out.println(right.size());
            }
            //System.out.println(left.size()+" "+right.size());
        }
    }
}
