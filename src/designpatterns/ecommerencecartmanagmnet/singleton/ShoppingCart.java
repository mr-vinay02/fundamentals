package designpatterns.ecommerencecartmanagmnet.singleton;

import designpatterns.ecommerencecartmanagmnet.factory.Product;
import designpatterns.ecommerencecartmanagmnet.observer.StockNotifier;

import java.util.*;

public class ShoppingCart {

    private static ShoppingCart instance;
    private List<Product> products = new ArrayList<>();

    public ShoppingCart() {
    }

    public static ShoppingCart getInstance() {
        if (instance == null)
            instance = new ShoppingCart();
        return instance;
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " added to cart.");
        StockNotifier.getInstance().notifyObservers(product.getName() + " stock updated!");
    }

    public List<Product> getProducts() { return products; }
}
