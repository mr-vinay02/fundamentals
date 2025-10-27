package multithreading.callableandfuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Calculating sum...");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
            Thread.sleep(500);
        }
        return sum;
    }
}
