import java.util.Scanner;

public class RecursiveDigitSum1 {

    static int result;

    static int super_digit(String string,int p){

        int sum=0;
        char[] chars = string.toCharArray();
        if(p>1){
            for(int i=0;i<chars.length;i++)
                sum+=Character.getNumericValue(chars[i]);
            sum*=p;
        }
        else {
            for(int i=0;i<chars.length;i++)
                sum+=Character.getNumericValue(chars[i]);
        }

        if(sum>10)
            return super_digit(Integer.toString(sum),1);
        else
            return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.next();
        int times = in.nextInt();
        //System.out.println(number);
        if(number.length()>1&&times>1){
            System.out.println(super_digit(number,times));
        }
        else{
            System.out.println(number);
        }

    }
}
