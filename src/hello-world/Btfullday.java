import java.util.Scanner;

public class Btfullday {

    public static int reverse(int n) {
        int result = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            result = result * 10 + rem;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i=in.nextInt();
        int j=in.nextInt();
        int k=in.nextInt();
        int count=0;

        for(int x=i;x<=j;x++) {
            int reverseX = reverse(x);
           // System.out.println(reverseX);

            int resultI = Math.abs(x-reverseX)/k;

            double resultD = Math.abs(x-reverseX)/(double)k;
          //  System.out.println(resultI+"--"+resultD);

            if(resultI==resultD){
                count++;
            }

        }

        System.out.println(count);

    }
}
