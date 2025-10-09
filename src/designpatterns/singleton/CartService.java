package designpatterns.singleton;

public class CartService {
    public static void main(String[] args) {

        CartSession cart = CartSession.getInstance();

        cart.addItem("Laptop");
        cart.addItem("Mobile");

        cart.viewCart();

        cart.addItem("Mouse");

        cart.viewCart();
        cart.clearCart();
    }
}
