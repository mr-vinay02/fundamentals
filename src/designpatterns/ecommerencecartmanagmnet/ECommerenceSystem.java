package designpatterns.ecommerencecartmanagmnet;

import designpatterns.ecommerencecartmanagmnet.abstractfactory.RegionFactory;
import designpatterns.ecommerencecartmanagmnet.abstractfactory.USFactory;
import designpatterns.ecommerencecartmanagmnet.builder.Builder;
import designpatterns.ecommerencecartmanagmnet.builder.CheckoutOrder;
import designpatterns.ecommerencecartmanagmnet.factory.Product;
import designpatterns.ecommerencecartmanagmnet.observer.Customer;
import designpatterns.ecommerencecartmanagmnet.observer.StockNotifier;
import designpatterns.ecommerencecartmanagmnet.singleton.ShoppingCart;
import designpatterns.ecommerencecartmanagmnet.strategy.ExpressShipping;
import designpatterns.ecommerencecartmanagmnet.strategy.ShippingContext;


public class ECommerenceSystem {

    public static void main(String[] args) {
        // Observers
        StockNotifier notifier = StockNotifier.getInstance();
        notifier.addObserver(new Customer("Archana"));
        notifier.addObserver(new Customer("Vinay"));

        // Cart Singleton
        ShoppingCart cart = ShoppingCart.getInstance();

        // Product Factories
        RegionFactory usFactory = new USFactory();
        Product p1 = usFactory.createElectronics();
        Product p2 = usFactory.createClothing();

        cart.addProduct(p1);
        cart.addProduct(p2);

        // Shipping Strategy
        ShippingContext shipping = new ShippingContext(new ExpressShipping());
        double shippingCost = shipping.applyShipping(0);

        // Build Checkout Order
        CheckoutOrder order = new Builder()
                .addProducts(cart.getProducts())
                .applyDiscount(500)
                .applyCoupon("NEWUSER50")
                .addShipping(shippingCost)
                .build();

        order.displayOrder();
    }


}
