package String;

import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = new String("asd.zxc.qwe");
        //String[] sarr = {"asd,zxc,aqw"};
        //String s =scanner.next();
        String[] s2=s.split("\\.");
        for(String s3:s2){
            System.out.println(s3);
        }
    }
}
