package designpatterns.ecommerencecartmanagmnet.AbstractFactory;

import designpatterns.ecommerencecartmanagmnet.factory.Book;
import designpatterns.ecommerencecartmanagmnet.factory.Clothing;
import designpatterns.ecommerencecartmanagmnet.factory.Electronics;
import designpatterns.ecommerencecartmanagmnet.factory.Product;

public class EUFactory implements RegionFactory {

    public Product createElectronics()
    {
        return new Electronics() {
            public String getName() { return "EU Electronics"; }
            public double getPrice() { return 16000; }
        };
    }

    public Product createClothing() {
        return new Clothing() {
            public String getName() { return "EU Clothing"; }
            public double getPrice() { return 2200; }
        };
    }
    public Product createBook() {
        return new Book() {
            public String getName() { return "EU Book"; }
            public double getPrice() { return 600; }
        };
    }
}