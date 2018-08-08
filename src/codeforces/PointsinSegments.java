package codeforces;

import java.util.Scanner;
//http://codeforces.com/contest/1015/problem/A
public class PointsinSegments {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr[];
        StringBuilder s =new StringBuilder();
        StringBuilder s2 =new StringBuilder();
        int count=0;
        int n=in.nextInt();
        int m=in.nextInt();
        for(int a=1;a<=m;a++){
            s.append(a);
        }
        int[][] arr2=new int[n][2];
        for(int i=0;i<n;i++){
            arr2[i][0]=in.nextInt();
            arr2[i][1]=in.nextInt();
            //l≤x≤r.
        }

        for(int j=0;j<m;j++){
            for(int p=0;p<n;p++) {
                if ((j+1) >= arr2[p][0] && (j+1) <= arr2[p][1]) {
                    count++;
                    //s2.append(j);
                    s.setCharAt(j,'0');
                    break;
                    // s.indexOf(String.valueOf(j))
                }
            }
            //s.deleteCharAt(j);
            //s.append(j);
        }
        //StringBuilder s3=s-s2;
        System.out.println(s.length()-count);
        if(count ==0){
            System.out.println(count);
        }else {
            for (int x = 0; x < s.length(); x++) {

                if (s.charAt(x) != '0') {
                    System.out.print(s.charAt(x) + " ");
                }
            }
        }
    }
}
