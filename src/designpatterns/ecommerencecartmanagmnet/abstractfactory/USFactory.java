package designpatterns.ecommerencecartmanagmnet.abstractfactory;

import designpatterns.ecommerencecartmanagmnet.factory.Book;
import designpatterns.ecommerencecartmanagmnet.factory.Clothing;
import designpatterns.ecommerencecartmanagmnet.factory.Electronics;
import designpatterns.ecommerencecartmanagmnet.factory.Product;

public class USFactory implements RegionFactory {
    public Product createElectronics()
    {
        return new Electronics() {
            public String getName() { return "US Electronics"; }
            public double getPrice() { return 18000; }
        }; }
    public Product createClothing() {
        return new Clothing() {
            public String getName() { return "US Clothing"; }
            public double getPrice() { return 2500; }
        }; }
    public Product createBook() {
        return new Book() {
            public String getName() { return "US Book"; }
            public double getPrice() { return 700; }
        }; }

}
