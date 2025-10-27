package multithreading.creationofthread;

public class MyThread extends Thread{

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {

                System.out.println("This is a thread Executing....");
                Thread.sleep(500);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
