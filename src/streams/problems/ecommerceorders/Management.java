package streams.problems.ecommerceorders;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Management {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(1, "Amit", 12000.50, "Pending"),
                new Order(2, "Bhavna", 8500.00, "Completed"),
                new Order(3, "Chirag", 430.75, "Cancelled"),
                new Order(4, "Deepa", 99999.99, "Pending"),
                new Order(5, "Eshan", 1500.00, "Completed"),
                new Order(6, "Farah", 6020.40, "Processing"),
                new Order(7, "Gaurav", 30000.00, "Completed"),
                new Order(8, "Harsha", 78.25, "Pending"),
                new Order(9, "Isha", 11000.00, "Processing"),
                new Order(10, "Jay", 950.60, "Completed"),
                new Order(11, "Kiran", 400.00, "Cancelled"),
                new Order(12, "Lakshmi", 1350.80, "Pending"),
                new Order(13, "Manoj", 7200.00, "Processing"),
                new Order(14, "Neha", 500.50, "Completed"),
                new Order(15, "Omkar", 890.90, "Pending")
        );

        //Get the names of customers with orders greater than 10,000.
        List<String> names = orders.stream()
                .filter(o -> o.getTotalAmount() > 10000)
                .map(Order::getCustomerName)
                .toList();

        System.out.println(names);

        //Find if any order is in "CANCELLED" status.
        orders.stream()
                .filter(o -> o.getStatus().equals("Cancelled") )
                .forEach(System.out::println);

        //Retrieve the smallest order amount using min(). Wrap it in Optional and handle null safely.
        Optional<Order> minOrder = orders.stream()
                .min((a,b) -> Double.compare(a.getTotalAmount(),b.getTotalAmount()));

        minOrder.ifPresentOrElse(System.out::println,() -> System.out.println("THERE IS NO ORDERS"));

        //Collect all unique order statuses into a Set.
        Set<String> status = orders.stream()
                .map(Order::getStatus)
                .collect(Collectors.toSet());

        System.out.println(status);

    }
}

