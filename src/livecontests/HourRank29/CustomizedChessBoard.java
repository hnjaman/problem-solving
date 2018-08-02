package livecontests.HourRank29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomizedChessBoard {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        while(n-- !=0){
            int t=in.nextInt();
            t=t*t;
            //List<Integer> arr =new ArrayList<>();
            List<List<Integer>> arr=new ArrayList<>();
            List<Integer> list=new ArrayList<>();
            int j=0;
            while(j++ <t){
                list.add(in.nextLine().split(" "));
            }
            arr.add(list);
            //in.nextInt();

            int count0=0;
            int count1=0;
            for (int k = 0; k < t-1; k++) {

                if(arr.get(k).compareTo(arr.get(k+1))==1){
                    count0=1;
                }else {
                    count0=-1;
                    break;
                }
            }

            if(count0==-1)
                System.out.println("No");
            if(count0==1)
                System.out.println("Yes");

        }
    }
}
