package multithreading.creationofthread;

public class ByRunnable {

    public static void main(String[] args) {

        MyRunnable thread = new MyRunnable();

        Thread t1 = new Thread(thread);
        t1.start();
    }
}
