package designpatterns.observer;

public class Customer implements Observers{

    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }



    @Override
    public void update(String productName) {
        System.out.println("Hello " + customerName + ", " + productName + " is now available. Hurry up and order!");
    }
}
