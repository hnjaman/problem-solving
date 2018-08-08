package codeforces;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        int count;
            while(i<q){
                count = 0;
                int l=in.nextInt();
                int r=in.nextInt();
                String seg=new String(s.substring(l-1,r));
                Pattern pattern = Pattern.compile(t);
                Matcher matcher = pattern.matcher(seg);
                while (matcher.find())
                    count++;
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