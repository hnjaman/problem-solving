package overflow;

import java.util.Scanner;

public class CheckOverflow {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE+1);
        Scanner in = new Scanner(System.in);
        int r=0;
        try{
            String s2 ="2147483648";
            int n=in.nextInt();

            while (n>0){
                String i = in.next();
                if (Integer.parseInt(i)>Integer.MAX_VALUE){
                    System.out.println("overflow");
                }else{
                    r=r+Integer.parseInt(i);
                }
            }

        }catch (NumberFormatException ex){
            System.out.println("number out of range");
            //System.out.println(r);
        }finally {
            System.out.println(r);
        }
    }
}
