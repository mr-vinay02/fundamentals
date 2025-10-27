package multithreading.locks;

public class Locks {
    public static void main(String[] args) {

        MyLock lock = new MyLock();

        Thread thread1 = new Thread(lock);

        Thread thread2 = new Thread(lock);

        thread1.start();
        thread2.start();

    }
}
