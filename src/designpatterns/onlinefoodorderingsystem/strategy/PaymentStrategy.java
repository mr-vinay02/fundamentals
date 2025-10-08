package designpatterns.onlinefoodorderingsystem.strategy;

public interface PaymentStrategy {

    boolean pay(String customerId, double amount);

}
