package multithreading.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleTask {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            int taskId = i ;
            executor.execute( () ->{
                try {
                    System.out.println("Task id :" + taskId + " Thread :" + Thread.currentThread().getName());
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            });
        }

        executor.shutdown();
    }
}
