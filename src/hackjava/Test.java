package hackjava;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String args[]){
       String s="-100";
       String s2="50";
        BigDecimal a=new BigDecimal(s);
        System.out.println(a);
        a=new BigDecimal(s2);
        System.out.println(a);
//        if(b!=a) {
//            System.out.println("n");//false ($ is not matched)
//        }else {
//            System.out.println("e");
//        }
    }
}
