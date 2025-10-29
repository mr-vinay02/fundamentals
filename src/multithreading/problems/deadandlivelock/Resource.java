package multithreading.problems.deadandlivelock;

public class Resource {

    private final String name ;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void use(Resource other ){

        System.out.println(Thread.currentThread().getName() + " locked" +this.name);

        try{
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " trying to lock" + this.name);

        synchronized ( other ){
            System.out.println(Thread.currentThread().getName() + " Locked " + this.name);
        }
    }


}
