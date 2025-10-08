package designpatterns.ecommerencecartmanagmnet.factory;

public class Book  implements Product {

    public String getName() {
        return "Book Item";
    }
    public double getPrice() {
        return 500;
    }
}
