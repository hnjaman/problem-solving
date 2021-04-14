package problemsolving;

public class WithOutLoopPrint10Hello {
    private static void sum(int m){
        if(m<=5){
            System.out.println("Hello world");
            sum(m+1);
        }
    }
    public static void main(String[] args) {
        sum(1);
    }
}
