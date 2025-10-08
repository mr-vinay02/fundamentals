package designpatterns.ecommerencecartmanagmnet.builder;

import designpatterns.ecommerencecartmanagmnet.factory.Product;

import java.util.List;

public class CheckoutOrder {
    private List<Product> products;
    private double discount;
    private double shippingCharge;
    private String couponCode;

    CheckoutOrder(Builder builder) {
        this.products = builder.products;
        this.discount = builder.discount;
        this.shippingCharge = builder.shippingCharge;
        this.couponCode = builder.couponCode;
    }

    public double getTotal() {
        double total = products.stream().mapToDouble(Product::getPrice).sum();
        total -= discount;
        total += shippingCharge;
        return total;
    }

    public void displayOrder() {
        System.out.println("🧾 Checkout Summary:");
        products.forEach(p -> System.out.println(" - " + p.getName() + " : ₹" + p.getPrice()));
        System.out.println("Discount: ₹" + discount);
        System.out.println("Shipping: ₹" + shippingCharge);
        System.out.println("Total Payable: ₹" + getTotal());
    }
}
