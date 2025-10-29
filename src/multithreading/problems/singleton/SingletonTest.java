package multithreading.problems.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Runnable run = () -> {
            Singleton singleton = Singleton.getInstance();
            singleton.showMessage();
            System.out.println(Thread.currentThread().getName() + " is created ");
        };


        Thread thread1 = new Thread(run, "Thread1");
        Thread thread2 = new Thread(run, "Thread2");
        Thread thread3 = new Thread(run, "Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
