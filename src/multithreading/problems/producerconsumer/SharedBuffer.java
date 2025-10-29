package multithreading.problems.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

public class SharedBuffer {

    private final Queue<Integer> queue = new LinkedList<>();
    private final int capacity;

    // Semaphores
    private final Semaphore empty; // available slots
    private final Semaphore full;  // available items
    private final Semaphore mutex; // mutual exclusion


    public SharedBuffer(int capacity) {
        this.capacity = capacity;
        this.empty = new Semaphore(capacity); // initially all slots empty
        this.full = new Semaphore(0);         // initially no items
        this.mutex = new Semaphore(1);        // one thread at a time
    }

    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();

        queue.add(item);
        System.out.println("Producer produced: " + item);

        mutex.release();
        full.release();
    }

    public int consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();

        int item = queue.remove();
        System.out.println("Consumer consumed: " + item);

        mutex.release();
        empty.release();
        return item;
    }
}
