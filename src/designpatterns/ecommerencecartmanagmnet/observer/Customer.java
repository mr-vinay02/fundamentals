package designpatterns.ecommerencecartmanagmnet.observer;

public class Customer implements Observer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
