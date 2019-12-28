public class Fact {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        Integer limit = 0;
        System.out.println(fact(limit));
        fib(0,1);
    }

    private static void fib(int n, int m) {
        if((n+m)<100) {
            if (n == 0 && m == 1)
                System.out.print(n + " " + m + " "+ (n+m));
            else
                System.out.print(" "+(n+m));
            fib(m,n+m);
        }
    }

    private static Integer fact(Integer limit) {
        if (limit > 0){
            return limit * fact(limit - 1);
        }
        return 1;
    }
}