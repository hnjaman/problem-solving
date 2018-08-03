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
        StringBuilder ss=new StringBuilder();
        ss.append(s.substring(0,n));
        StringBuilder tt=new StringBuilder();
        tt.append(t.substring(0,m));
//        System.out.println(ss);
//        System.out.println(tt);
        in.nextLine();
        int i=0;
        while(i<q){
            int count=0;
            StringBuilder seg=new StringBuilder();
            int l=in.nextInt();
            int r=in.nextInt();
            seg.append(ss.substring(l-1,r));
            int len1=seg.length();
            int len2=tt.length();
            if(tt.length()>seg.length()){
                System.out.println(0);
            }else if(seg.toString().equals(tt.toString())){
                System.out.println(1);
            }else if(seg.toString().substring(len1-len2,len1).equals(tt.toString())){
                String[] arr=seg.toString().split(tt.toString());
                System.out.println(arr.length);
            }else {
                String[] arr=seg.toString().split(tt.toString());
                System.out.println(arr.length-1);
            }
            //System.out.println(arr.length-1);
//            if(tt.length()>seg.length()){
//                System.out.println(count);
//            }else {
//                int len=seg.length()-tt.length()+1;
//                for (int j = 0; j < len; j++){
//                    StringBuilder test=new StringBuilder(seg.substring(j,tt.length()+j));
//                    if(test.toString().equals(tt.toString())){
//                        count++;
//                    }
//                }
//                System.out.println(count);
//            }
            i++;
        }
    }
}
