package thread;

public class MainThreadEx extends Thread {
    @Override
    public void run() {
        String currentThreadName = Thread.currentThread().getName();
        System.out.println("Thread name"+currentThreadName);
    }

    //    public static void main(String[] args) {
//        Thread currentThread = Thread.currentThread();
//        System.out.println(currentThread.getName());
//    }
}
