package designpatterns.strategy;

public class ShippingCart {

    private double totalAmount ;

    public ShippingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void makePayment(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(totalAmount);
    }
}
