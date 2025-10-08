package designpatterns.ecommerencecartmanagmnet.strategy;

public class InternationalShipping implements ShippingStrategy{
    @Override
    public double calculateShipping(double orderTotal) {
        return 1500;
    }
}
