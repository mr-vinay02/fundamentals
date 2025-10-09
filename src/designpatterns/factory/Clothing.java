package designpatterns.factory;

public class Clothing implements Products {

    @Override
    public void displayInfo() {
        System.out.println("👕 Clothing Product: T-shirts, Jeans, Jackets...");
    }

}
