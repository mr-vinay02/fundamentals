package designpatterns.factory;

public class Grocery implements Products{

    @Override
    public void displayInfo() {
        System.out.println("🛒 Grocery Product: Fruits, Vegetables, Snacks...");
    }

}
