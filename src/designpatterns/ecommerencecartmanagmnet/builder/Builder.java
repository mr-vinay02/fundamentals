package designpatterns.ecommerencecartmanagmnet.builder;

import designpatterns.ecommerencecartmanagmnet.factory.Product;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    List<Product> products = new ArrayList<>();
    double discount;
    double shippingCharge;
    String couponCode;

    public Builder addProducts(List<Product> products) {
        this.products = products;
        return this;
    }

    public Builder applyDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public Builder applyCoupon(String code) {
        this.couponCode = code;
        return this;
    }

    public Builder addShipping(double cost) {
        this.shippingCharge = cost;
        return this;
    }

    public CheckoutOrder build() {
        return new CheckoutOrder(this);
    }
}

