package hackjava;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String args[]){
       // System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun32"));//true
      //  System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)
      //  System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2Uk2"));//true
        Scanner sc =new Scanner(System.in);
        String username=sc.next();
        boolean result=Pattern.matches("[^0-9_?][a-zA-Z0-9[_]]{7,30}", username);
        if(result) {
            System.out.println("Valid");//false ($ is not matched)
        }else {
            System.out.println("Invalid");
        }
    }
}
