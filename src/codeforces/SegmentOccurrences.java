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
        //int count;
            while(i<q){
                //count = 0;
                int l=in.nextInt();
                int r=in.nextInt();
                String seg=new String(s.substring(l-1,r));
                //String str = "helloslkhellodjladfjhello";
                //String findStr = "hello";
                int lastIndex = 0;
                int count = 0;

                while(lastIndex != -1){
                    lastIndex = seg.indexOf(t,lastIndex);
                    if(lastIndex != -1){
                        count ++;
                        lastIndex += t.length();
                    }
                }
                System.out.println(count);
                i++;
            }
    }
}

//if(s.length()==0){
//        System.out.println(0);
//        }else if(t.length()==0){
//        System.out.println(0);
//        }else