package designpatterns.ecommerencecartmanagmnet.strategy;

public class ExpressShipping implements ShippingStrategy{
    @Override
    public double calculateShipping(double orderTotal) {
        return 800;
    }
}
