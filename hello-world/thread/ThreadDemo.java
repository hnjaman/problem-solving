package thread;

public class ThreadDemo {
    public static void main(String[] args) {
        ThreadRunnable threadRunnable = new ThreadRunnable();

        Thread thread = new Thread(threadRunnable);
        thread.setName("runable thread");
        thread.start();
    }
}
