package codeforces;

import java.util.Scanner;

public class SegmentOccurrences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int q=in.nextInt();
        String s=in.next();
        String t=in.next();
        in.nextLine();
        int i=0;
        while(i<q){
            int l=in.nextInt();
            int r=in.nextInt();
            String seg=new String(s.substring(l-1,r));
            int len1=seg.length();
            int len2=t.length();
            if(t.length()>seg.length()){
                System.out.println(0);
            }else if(seg.equals(t)){
                System.out.println(1);
            }else if(seg.substring(len1-len2,len1).equals(t)){
                String[] arr=seg.split(t);
                System.out.println(arr.length);
            }else {
                String[] arr=seg.split(t);
                System.out.println(arr.length-1);
            }
            i++;
        }
    }
}
