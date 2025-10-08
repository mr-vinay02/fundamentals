package designpatterns.observer;

public class MainObserver {

    public static void main(String[] args) {

        Product iphone = new Product("IPHONE 17 PRO MAX");

        Observers customer1 = new Customer("Vinay");
        Observers customer2 = new Customer("ullas");
        Observers customer3 = new Customer("abhi");

        iphone.registerObserver(customer1);
        iphone.registerObserver(customer2);
        iphone.registerObserver(customer3);

        iphone.notifyObservers();

        iphone.removeObserver(customer3);

        iphone.notifyObservers();

    }
}
