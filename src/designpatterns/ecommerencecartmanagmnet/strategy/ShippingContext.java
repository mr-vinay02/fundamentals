package designpatterns.ecommerencecartmanagmnet.strategy;

public class ShippingContext {

    private ShippingStrategy strategy;

    public ShippingContext(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double applyShipping(double orderTotal){
        return strategy.calculateShipping(orderTotal);
    }
}
