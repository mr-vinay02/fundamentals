package designpatterns.onlinefoodorderingsystem.strategy;

public class UpiPayment implements PaymentStrategy {

    public boolean pay(String customerId, double amount) {
        System.out.println("[Payment] Processing UPI payment ₹" + amount + " for " + customerId);
        return true;
    }

}

