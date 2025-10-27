package multithreading.callableandfuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MutlipleTasks {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService exector = Executors.newFixedThreadPool(3);

        Callable<String> task1 = () -> "Task 1 Done";
        Callable<String> task2  = () -> "Task 2 Done";
        Callable<String> task3 = () -> "Task 3 Done";

        List<Callable<String>> tasks = Arrays.asList(task1,task2,task3);

        List<Future<String>> futures = exector.invokeAll(tasks);


        for (Future future : futures){
            System.out.println(future.get());
        }

        exector.shutdown();
    }
}
