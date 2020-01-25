package lambda;
//Java Lambda Expression Example: with or without return keyword
//In Java lambda expression, if there is only one statement,
// you may or may not use return keyword. You must use return keyword
// when lambda expression contains multiple statements.
interface Addable2{
    int add(int a,int b);
}
public class LambdaExpressionExample6 {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable2 ad1=(a,b)->(a+b);
        System.out.println(ad1.add(10,20));

        // Lambda expression with return keyword.
        Addable2 ad2=(int a,int b)->{
            return (a+b);
        };
        System.out.println(ad2.add(100,200));
    }
}
