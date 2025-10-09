package designpatterns.factory;

public class Electrnoics implements Products {

    @Override
    public void displayInfo() {
        System.out.println("📱 Electronics Product: Phone, Laptop, Headphones...");
    }

}
