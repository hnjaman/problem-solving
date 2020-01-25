package lambda;

public class ThreadCreationLambda {

    public static void main(String[] args) {

        //Thread Example without lambda
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("with out lambda");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

        //Thread Example with lambda
        Runnable r2=()->{
            System.out.println("with lambda");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
