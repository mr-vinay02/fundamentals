package designpatterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class CartSession {

    private static CartSession instance;
    private List<String> items;

    private CartSession() {
        items = new ArrayList<>();
    }

    public static CartSession getInstance() {
        if (instance == null) {
            instance = new CartSession();
        }
        return instance;
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to cart.");
    }


    public void removeItem(String item) {
        items.remove(item);
        System.out.println(item + " removed from cart.");
    }

    public void viewCart() {
        System.out.println(" Cart Items: " + items);
    }

    public void clearCart() {
        items.clear();
        System.out.println("Cart cleared!");
    }
}
