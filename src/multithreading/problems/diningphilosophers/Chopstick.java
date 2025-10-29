package multithreading.problems.diningphilosophers;

import java.util.concurrent.Semaphore;

public class Chopstick {
    private final Semaphore semaphore = new Semaphore(1);

    public void pickUp() throws InterruptedException {
        semaphore.acquire();
    }

    public void putDown() {
        semaphore.release();
    }
}
