package designpatterns.onlinefoodorderingsystem.builder;

import designpatterns.onlinefoodorderingsystem.factory.FoodItem;
import designpatterns.onlinefoodorderingsystem.observer.OrderObserver;

import java.util.*;

public class Order {

        public enum Status { PLACED, PREPARING, DISPATCHED, DELIVERED, CANCELLED }

        private final UUID orderId;
        private final String customerId;
        private final List<FoodItem> items;
        private final Map<String,String> customizations; // e.g., "Pizza1" -> "extra cheese"
        private Status status;

        // Observers for status changes ---- Observer pattern
        private final List<OrderObserver> observers = new ArrayList<>();

        Order(OrderBuilder builder) {
            this.orderId = UUID.randomUUID();
            this.customerId = builder.customerId;
            this.items = Collections.unmodifiableList(new ArrayList<>(builder.items));
            this.customizations = Collections.unmodifiableMap(new HashMap<>(builder.customizations));
            this.status = Status.PLACED;
        }

        public UUID getOrderId() { return orderId; }
        public String getCustomerId() { return customerId; }
        public List<FoodItem> getItems() { return items; }
        public Map<String,String> getCustomizations() { return customizations; }
        public Status getStatus() { return status; }

        // Observer pattern methods
        public void subscribe(OrderObserver obs) { observers.add(obs); }
        public void unsubscribe(OrderObserver obs) { observers.remove(obs); }

        public void setStatus(Status newStatus) {
            this.status = newStatus;
            notifyObservers();
        }

        private void notifyObservers() {
            for (OrderObserver o : observers) o.update(this);
        }

        // For demonstration: compute total
        public double getTotal() {
            double sum = 0;
            for (FoodItem f : items) sum += f.getPrice();
            // possible customizations can alter price; skipped for brevity
            return sum;
        }


        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Order[").append(orderId).append("] customer=").append(customerId)
                    .append(" status=").append(status).append("\nItems:\n");
            for (FoodItem f : items) sb.append(" - ").append(f.getName()).append(" (₹").append(f.getPrice()).append(")\n");
            return sb.toString();
        }
    }




}
