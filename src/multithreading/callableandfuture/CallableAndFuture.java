package multithreading.callableandfuture;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableAndFuture {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        MyCallable call = new MyCallable();

        Future<Integer> future = executor.submit(call);

        int sum = future.get();

        System.out.println(sum);

        executor.shutdown();
    }
}
