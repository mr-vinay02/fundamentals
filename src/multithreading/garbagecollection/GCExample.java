package multithreading.garbagecollection;

public class GCExample {
    private int id;

    public GCExample(int id) {
        this.id = id;
        System.out.println("Object " + id + " is created.");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object " + id + " is garbage collected.");
    }
}
