package lambda;

//Java Lambda Expression Example: Single Parameter
//interface Sayable2{
//    public String say(String name);
//}
public class LambdaExpressionExample4  implements iSayable{
    public static void main(String[] args) {

        // You can omit function parentheses
        iSayable s2 = name -> {return "Hello";};
        //};
        // Lambda expression with single parameter.
        iSayable s1=(name)-> {return "Hello, "+name;};
        //};


        System.out.println(s1.say("Sonoo1"));
        System.out.println(s2.say("Sonoo2"));


    }

    @Override
    public String say(String name) {
        return null;
    }
}
