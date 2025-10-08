package designpatterns.onlinefoodorderingsystem.observer;

import designpatterns.onlinefoodorderingsystem.builder.Order;

public interface OrderObserver {
    void update(Order order);
}
