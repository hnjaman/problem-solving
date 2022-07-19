package hackerRank.hackjava;

public class Fizzbuzz {

    public static void fizzbuzz(int n){
        for(int i = 1; i<=n; i++){
            if(i % 3 == 0)
                System.out.print("Fizz");
            if(i%5==0)
                System.out.print("Buzz");
            else if(i%3 != 0)
                System.out.print(i);
            System.out.println();
        }
    }

    public static void main(String[]args){
        fizzbuzz(15);
    }
}