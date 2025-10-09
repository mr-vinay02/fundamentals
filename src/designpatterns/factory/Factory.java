package designpatterns.factory;

public class Factory {
    public static void main(String[] args) {

        Products electronics  = ProductsFactory.createProduct("electronics");
        electronics.displayInfo();

        Products clothing = ProductsFactory.createProduct("clothing");
        clothing.displayInfo();

        Products grocery = ProductsFactory.createProduct("grocery");
        grocery.displayInfo();

    }
}
