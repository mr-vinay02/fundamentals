package designpatterns.onlinefoodorderingsystem.strategy;

public class PayPalPayment implements PaymentStrategy {

    public boolean pay(String customerId, double amount) {
        System.out.println("[Payment] Processing PayPal payment ₹" + amount + " for " + customerId);
        return true;
    }

}

