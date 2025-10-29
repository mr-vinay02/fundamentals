package multithreading.problems.producerconsumer;

public class Consumer extends Thread{

    public final SharedBuffer buffer;

    public Consumer(SharedBuffer buffer) {
        this.buffer = buffer;
    }

    public void run(){

        for (int i = 0; i <= 10 ; i++) {

            try{
                buffer.consume();
                Thread.sleep(300);
            }catch (InterruptedException e ){
                Thread.currentThread().interrupt();
            }
        }
    }
}
