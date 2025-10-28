package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {

    public static void main(String[] args) {

        ExecutorService  executor = Executors.newSingleThreadExecutor();

        executor.submit(() -> {
            try {
                System.out.println("This is a single thread executor");
                Thread.sleep(5000);
                System.out.println("This is a print after 5 milli delay");
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        });

        executor.shutdown();
    }
}
