package hackjava;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        int n=in.nextInt();
        while(n-- !=0){
            int d=in.nextInt();
            ArrayList<Integer> list =new ArrayList<>();
            while (d-- !=0){
                list.add(in.nextInt());
            }
            lists.add(list);
        }

        int q=in.nextInt();
        for(int i=0;i<q;i++){
            int x=in.nextInt();
            int y=in.nextInt();
//            if(y>lists.get(x-1).size()){
//                System.out.println("ERROR!");
//            }else{
//                System.out.println(lists.get(x-1).get(y-1));
//            }

            // ### its better to use try catch than if condition
            try {
                System.out.println(lists.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }

           // lists.get(x-1).get(y-1);
        }
    }
}
