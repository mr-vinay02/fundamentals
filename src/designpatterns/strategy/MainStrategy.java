package designpatterns.strategy;

public class MainStrategy {

    public static void main(String[] args) {

        ShippingCart cart = new ShippingCart(5999.99);

        PaymentStrategy card = new CreditCardPayment("1234567");

        cart.makePayment(card);

        PaymentStrategy upi = new UPIPayment("Vinayvini@upi");
        cart.makePayment(upi);


        PaymentStrategy payPal = new PaypalPayment("vinayvini4630@gmail.com");
        cart.makePayment(payPal);

    }
}
