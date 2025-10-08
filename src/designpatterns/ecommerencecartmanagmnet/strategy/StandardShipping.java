package designpatterns.ecommerencecartmanagmnet.strategy;

public class StandardShipping implements ShippingStrategy {
    @Override
    public double calculateShipping(double orderTotal) {
        return 300;
    }
}
