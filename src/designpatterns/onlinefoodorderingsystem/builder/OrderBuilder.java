package designpatterns.onlinefoodorderingsystem.builder;

import designpatterns.onlinefoodorderingsystem.factory.FoodItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderBuilder {

    String customerId;
    final List<FoodItem> items = new ArrayList<>();
    final Map<String,String> customizations = new HashMap<>();

    public OrderBuilder forCustomer(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public OrderBuilder addItem(FoodItem item) {
        items.add(item);
        return this;
    }
    public OrderBuilder addCustomization(String key, String customization) {
        customizations.put(key, customization);
        return this;
    }
    public Order build() {
        if (customerId == null || customerId.isEmpty()) {
            throw new IllegalStateException("CustomerId required");
        }
        if (items.isEmpty()) {
            throw new IllegalStateException("Order must have at least one item");
        }
        return new Order(this);
    }
}

