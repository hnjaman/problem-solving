package codeforces;

import java.util.Scanner;
//https://www.javacodeexamples.com/java-count-occurrences-of-substring-in-string-example/724
//http://codeforces.com/contest/1016/problem/B
public class SegmentOccurrences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int q=in.nextInt();
        String ss=in.next();
        String tt=in.next();
        String s=ss.substring(0,n);
        //System.out.println(s);
        String t=tt.substring(0,m);
        //System.out.println(t);
        in.nextLine();
        int i=0;

       // String hello = "HelloxxxHelloxxxHello";

        int fromIndex;
        int count;
            while(i<q){
                count = 0;
                int l=in.nextInt();
                int r=in.nextInt();
                String seg=new String(s.substring(l-1,r));
               // String strFind = "Java";
                int count1 = ( seg.split(t, -1).length ) - 1;
                System.out.println(count1);
                i++;
            }
    }
}

//if(s.length()==0){
//        System.out.println(0);
//        }else if(t.length()==0){
//        System.out.println(0);
//        }else