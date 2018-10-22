package hackjava;

import java.util.Scanner;

class MyRegex{
  // mobile number validation 
  // ^01([5-9]{1})([0-9]{8})|013([0-9]{8})$
  // ^0([1-9]{1})|1([0-2]{1})$    -- month 01, 12 etc validation
   
(
   25[0-5]{0,1}|           // 250 - 255
   2[0-4]{0,1}[0-9]{0,1}|  // 200 - 249
   1[0-9]{0,1}[0-9]{0,1}|  // 100 - 199
   0[0-9]{0,1}[0-9]{0,1}|  // 000 - 099
   [0-9]{0,1}[0-9]{0,1}    // 00 - 99
)[.]
   
   // public static final String pattern = "[0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}";
   public static final String pattern ="(25[0-5]{0,1}|2[0-4]{0,1}[0-9]{0,1}|1[0-9]{0,1}[0-9]{0,1}|0[0-9]{0,1}[0-9]{0,1}|[0-9]{0,1}[0-9]{0,1})[.]" +
           "(25[0-5]{0,1}|2[0-4]{0,1}[0-9]{0,1}|1[0-9]{0,1}[0-9]{0,1}|0[0-9]{0,1}[0-9]{0,1}|[0-9]{0,1}[0-9]{0,1})[.]" +
           "(25[0-5]{0,1}|2[0-4]{0,1}[0-9]{0,1}|1[0-9]{0,1}[0-9]{0,1}|0[0-9]{0,1}[0-9]{0,1}|[0-9]{0,1}[0-9]{0,1})[.]" +
           "(25[0-5]{0,1}|2[0-4]{0,1}[0-9]{0,1}|1[0-9]{0,1}[0-9]{0,1}|0[0-9]{0,1}[0-9]{0,1}|[0-9]{0,1}[0-9]{0,1})";

}

public class JavaRegexIPAddress {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
