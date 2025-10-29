package multithreading.garbagecollection;

public class GarbageCollectionDemo {

    public static void main(String[] args) {

        System.out.println("Program started...");

        // Creating multiple objects
        GCExample obj1 = new GCExample(1);
        GCExample obj2 = new GCExample(2);
        GCExample obj3 = new GCExample(3);

        // Nullifying references
        obj1 = null;
        obj2 = null;
        obj3 = null;

        // Requesting Garbage Collection
        System.out.println("Requesting garbage collection...");
        System.gc(); // Suggests JVM to run GC

        // Just to delay program end (so GC can run)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program ended.");

    }
}
