public class FactRecursion {
    static int factorial(int n){
        return n==0 ? 0 : (n==1 ? 1 : n * factorial(n-1));
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is: "+factorial(5));
    }
}
