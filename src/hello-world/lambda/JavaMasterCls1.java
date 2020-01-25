package lambda;

public class JavaMasterCls1 {
    public static void main(String[] args) {
        System.out.println("---------------without lambda------------");
        new Thread(()-> System.out.println("lambda")).start();

        Runnable r2=()->{
            System.out.println("Runnable > new Thread");
        };
        Thread t2=new Thread(r2);
        t2.start();

        System.out.println("---------------without lambda------------");

        new Thread(new CodeToRun()).start();

        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("new runnable > new Thread");
            }
        };
        Thread t1=new Thread(r1);
        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("new thread > new runnable");
            }
        }).start();

    }
}

class CodeToRun implements Runnable{
    @Override
    public void run(){
        System.out.println("Coderun implements Runnable > new Thread(new CodeToRun())");
    }
}