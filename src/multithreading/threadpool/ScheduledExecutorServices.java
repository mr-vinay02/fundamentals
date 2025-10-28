package multithreading.threadpool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServices {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);


        for (int i = 0; i < 10; i++) {
            int taskId = i ;
            scheduler.scheduleAtFixedRate( () ->{
                try {
                    System.out.println("Task id :" + taskId + " Thread :" + Thread.currentThread().getName());
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            } , 1 , 2 , TimeUnit.SECONDS);
        }

        try {
            Thread.sleep(10000); // wait 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scheduler.shutdown();
    }
}
