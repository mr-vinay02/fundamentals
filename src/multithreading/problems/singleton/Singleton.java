package multithreading.problems.singleton;

public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {

        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello from Singleton instance");
    }
}
