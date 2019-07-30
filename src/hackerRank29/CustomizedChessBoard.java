package hackerRank29;

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
            //in.nextLine();
            List<List<Integer>> arr=new ArrayList<>();
            int l=0;

            while (l<t){
                List<Integer> list=new ArrayList<>();
                int j=0;
                while(j<t){
                    list.add(in.nextInt());
                    j++;
                }
                arr.add(l,list);
                //list.clear();
                l++;
                //in.nextLine();
            }
                //arr.get(k).get(m).compareTo(arr.get(k).get(m + 1))
            int count=0;
            for (int k = 0; k < t; k++){
                for (int m = 0; m < t-1; m++) {
                    if (arr.get(k).get(m)!=arr.get(k).get(m+1)){
                        count = 1;
                    }else{
                        count = -1;
                        break;
                    }
                }
                if(count==-1)
                    break;
            }

            if(count==-1)
                System.out.println("No");
            if(count==1)
                System.out.println("Yes");
        }
    }
}
