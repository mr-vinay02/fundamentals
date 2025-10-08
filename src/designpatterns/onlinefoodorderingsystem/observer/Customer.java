package designpatterns.onlinefoodorderingsystem.observer;

import designpatterns.onlinefoodorderingsystem.builder.Order;

public class Customer implements OrderObserver {
    private final String customerId;
    private final String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void update(Order order) {
        System.out.println("[Notify] Customer " + name + " : Order " + order.getOrderId() + " is now " + order.getStatus());
    }
}
