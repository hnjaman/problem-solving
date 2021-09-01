package thread;

import java.util.concurrent.TimeUnit;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("inside "+Thread.currentThread().getName());
            sleepOneSecond();
        }
    }

    private static void sleepOneSecond() {
        try{
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
