package multithreading.problems.deadandlivelock;

public class DeadLock extends Thread {

    public static void main(String[] args) {

        final Resource resource1 = new Resource("Resource 1 ");
        final Resource resource2 = new Resource("Resource 2 ");

        Thread t1 = new Thread( () -> resource1.use(resource2) );
        Thread t2 = new Thread( () -> resource2.use(resource1) );

        t1.start();
        t2.start();
    }
}
