package hackjava;

import java.util.Scanner;

class MyRegex{
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
