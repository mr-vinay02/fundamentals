package multithreading.locks;

import java.util.concurrent.locks.ReentrantLock;

public class MyLock  implements Runnable{

    final ReentrantLock lock = new ReentrantLock();

    public void makeMyLocksWorking(){

        if(lock.tryLock()){

            try{

                System.out.println(Thread.currentThread().getName()+" thread is locked");
                Thread.sleep(500);

            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName()+" thread is released");
            }

        }else{

            System.out.println(Thread.currentThread().getName() + " couldn’t get the lock!");
        }
    }

    @Override
    public void run() {
        makeMyLocksWorking();
    }
}
