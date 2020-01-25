package thread;

import java.util.concurrent.TimeUnit;

public class Watch implements Runnable{
    private static boolean running=true;
    public static int count=1;
    @Override
    public void run() {
        while (running){
            printCurrentTime();
           // sleepOneSecond();
            if(count>10){
                System.out.println("thread terminated");
                running=false;
            }
        }
    }

    private void sleepOneSecond() {
        try{
            //Thread.sleep(1000);
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void printCurrentTime() {
        System.out.println(count);
        ++count;

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:s a");
//        String formatedCurrentTime = LocalDateTime.now().format(dateTimeFormatter);
//        System.out.println(formatedCurrentTime);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread watchThread = new Thread(new Watch());
        watchThread.start();

        Thread.sleep(50);
        watchThread.interrupt();
    }
}
