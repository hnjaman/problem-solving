//package thread;
//
//import java.util.concurrent.locks.Lock;
//
//import static com.sun.activation.registries.LogSupport.log;
//
//public class Philosopher implements Runnable {
//    private String name;
//    private final Lock leftlock;
//    private final Lock rightlock;
//
//    public Philosopher(String name, Lock leftlock, Lock rightlock) {
//        this.name = name;
//        this.leftlock = leftlock;
//        this.rightlock = rightlock;
//    }
//
//    public void think(){
//        log("thinking");
//    }
//
//    public void eat(){
//        // assume, eating requires some time
//        //lets put a random number
//        try{
//            log("eating");
//            int eatingTime = getRandomEatingTime();
//        } catch (InterruptedException e){
//            Thread.currentThread().interrupt();
//            throw new AssertionError(e);
//        }
//    }
//
//    private int getRandomEatingTime() {
//
//    }
//
//    @Override
//    public void run() {
//
//    }
//}
