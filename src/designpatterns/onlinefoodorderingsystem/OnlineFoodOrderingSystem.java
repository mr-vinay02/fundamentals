package designpatterns.onlinefoodorderingsystem;

import designpatterns.onlinefoodorderingsystem.abstractfactory.CuisineFactory;
import designpatterns.onlinefoodorderingsystem.abstractfactory.IndianFactory;
import designpatterns.onlinefoodorderingsystem.abstractfactory.ItalianFactory;
import designpatterns.onlinefoodorderingsystem.builder.Order;
import designpatterns.onlinefoodorderingsystem.builder.OrderBuilder;
import designpatterns.onlinefoodorderingsystem.observer.Customer;
import designpatterns.onlinefoodorderingsystem.singleton.DBConnection;
import designpatterns.onlinefoodorderingsystem.strategy.PaymentStrategy;
import designpatterns.onlinefoodorderingsystem.strategy.UpiPayment;

public class OnlineFoodOrderingSystem {

    public static void main(String[] args) {
        // Ensure DB connection singleton initialized
        DBConnection.getInstance();

        // Create two cuisine factories
        CuisineFactory italianFactory = new ItalianFactory();
        CuisineFactory indianFactory = new IndianFactory();

        // Build an order using Builder (complex order with customizations)
        OrderBuilder builder = new OrderBuilder()
                .forCustomer("cust123")
                .addItem(italianFactory.createPizza("margherita"))
                .addItem(italianFactory.createDrink("coke"))
                .addCustomization("Pizza1", "extra cheese");

        Order order = builder.build();

        // Create customer observer and subscribe
        Customer customer = new Customer("cust123", "Archana");
        order.subscribe(customer);

        // Show order summary
        System.out.println(order);

        // Choose payment strategy dynamically (Strategy pattern)
        PaymentStrategy payment = new UpiPayment(); // could be CreditCardPayment or PayPalPayment

        // Place order (OrderService uses Singleton DB and updates order status -> observers notified)
        OrderService service = new OrderService();
        service.placeOrder(order, payment);

        // At the end, unsubscribe if desired
        order.unsubscribe(customer);
    }

}
