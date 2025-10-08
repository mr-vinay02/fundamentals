package designpatterns.ecommerencecartmanagmnet.factory;

public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "electronics":
                return new Electronics();

            case "clothing":
                return new Clothing();

            case "book":
                return new Book();

            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
