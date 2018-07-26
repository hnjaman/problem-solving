package hackjava;

import java.util.Scanner;

public class StringTokensMultipleRegexSplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
       // String ss=s.trim();
        String[] sp=s.split("_|\\.|\\s|\\,|\\!|\\,|\\?|\\'|\\@");
        for(int i=0;i<sp.length;i++){
            System.out.println(sp[i]);
        }
        scan.close();
    }
}
