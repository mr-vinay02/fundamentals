package multithreading;

public class ThreadInterruptionDemo {

    static class Worker extends Thread{

        @Override
        public void run(){
            try{

                for (int i = 0; i <= 10; i++) {

                    if(Thread.currentThread().isInterrupted()){
                        System.out.println(Thread.currentThread().getName() + " was interrupted! Stopping work...");
                        break;
                    }

                    System.out.println(Thread.currentThread().getName() + " is working on task " + i);
                    Thread.sleep(2000);

                }

            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted during sleep. Cleaning up...");
            }

            System.out.println(Thread.currentThread().getName() + " finished execution.");

        }
    }

    public static void main(String[] args) throws InterruptedException{

        Worker worker = new Worker();

        worker.start();

        Thread.sleep(2000);

        System.out.println("Main thread: requesting interruption...");
        worker.interrupt();

    }
}
