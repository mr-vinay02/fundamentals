package designpatterns.onlinefoodorderingsystem;

import designpatterns.onlinefoodorderingsystem.builder.Order;
import designpatterns.onlinefoodorderingsystem.singleton.DBConnection;
import designpatterns.onlinefoodorderingsystem.strategy.PaymentStrategy;

public class OrderService {

    private final DBConnection db;

    public OrderService() {
        this.db = DBConnection.getInstance();
    }

    public boolean placeOrder(Order order, PaymentStrategy paymentStrategy) {
        System.out.println("[OrderService] Placing order " + order.getOrderId() + " for " + order.getCustomerId());
        double total = order.getTotal();
        boolean paid = paymentStrategy.pay(order.getCustomerId(), total);

        if (!paid) {
            order.setStatus(Order.Status.CANCELLED);
            return false;
        }

        System.out.println("[OrderService] Order persisted to DB: " );
        order.setStatus(Order.Status.PREPARING);

        simulatePreparationAndDelivery(order);
        return true;
    }

    private void simulatePreparationAndDelivery(Order order) {
        try {
            Thread.sleep(200); // simulate time
            order.setStatus(Order.Status.DISPATCHED);
            Thread.sleep(200);
            order.setStatus(Order.Status.DELIVERED);
        } catch (InterruptedException e) {
            order.setStatus(Order.Status.CANCELLED);
        }
    }
}
