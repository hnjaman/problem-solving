package hackerRank.hackjava;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            //StringBuilder xs = new StringBuilder(x);
//            String xs=new String(String.valueOf(x));
//            String xss="";
//            if(xs.length() == 1){
//                 xss="00"+xs;
//            }else if(xs.length()==2){
//                 xss="0"+xs;
//            }else{
//                xss=xs;
//            }
//           // String xss =xs.length()>2 ? String.valueOf(xs) : "0"+xs;
//            //System.out.println(xss);
//
//            System.out.println(s1+"\t\t\t"+xss);
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
