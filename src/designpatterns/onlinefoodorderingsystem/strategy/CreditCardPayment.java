package designpatterns.onlinefoodorderingsystem.strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public boolean pay(String customerId, double amount) {
        System.out.println("[Payment] Charging ₹" + amount + " to CreditCard for customer " + customerId);
        return true;
    }

}
