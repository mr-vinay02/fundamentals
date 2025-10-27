package multithreading.creationofthread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {

        try{
            for (int i = 0; i < 5; i++) {
                System.out.println("This is a Runnable Implemented thread");
                Thread.sleep(500);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
