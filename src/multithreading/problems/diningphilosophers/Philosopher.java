package multithreading.problems.diningphilosophers;

public class Philosopher extends Thread{
    private final int id;
    private final Chopstick leftChopstick;
    private final Chopstick rightChopstick;

    public Philosopher(int id, Chopstick left, Chopstick right) {
        this.id = id;
        this.leftChopstick = left;
        this.rightChopstick = right;
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking...");
        Thread.sleep((int) (Math.random() * 1000));
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating...");
        Thread.sleep((int) (Math.random() * 1000));
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();

                // To avoid deadlock: last philosopher picks up right first
                if (id == 4) {
                    rightChopstick.pickUp();
                    leftChopstick.pickUp();
                } else {
                    leftChopstick.pickUp();
                    rightChopstick.pickUp();
                }

                eat();

                leftChopstick.putDown();
                rightChopstick.putDown();

                System.out.println("Philosopher " + id + " finished eating and put down chopsticks.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
