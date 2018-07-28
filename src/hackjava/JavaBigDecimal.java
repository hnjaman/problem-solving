package hackjava;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        BigDecimal a, b;
        for (int i = 0; i < s.length - 1-2; i++)
        {
            int index = i;
            for (int j = i + 1; j < s.length-2; j++){
//                String as=new String(s[j]);
//                String bs =new String(s[index]);
//                System.out.println(as);
//                System.out.println(bs);
                a=new BigDecimal(s[j]);
                b=new BigDecimal(s[index]);
                int res =a.compareTo(b);

                if (res==1){
                   // BigDecimal.valueOf(BigDecimals[j])
                    index = j;//searching for lowest index
                }
            }
           // BigDecimal  smallerNumber = new BigDecimal(s[index]);
            String  smallerNumber = new String(s[index]);
            s[index] = s[i];
            s[i] = smallerNumber;
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
