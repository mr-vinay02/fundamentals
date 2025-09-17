package oopsimplementation.inventorymanagementsystem;

public class Orders {

    int[] productIds;
    int[] quantities;
    int orderSize;

    public Orders(int orderSize) {
        this.orderSize = orderSize;
        productIds = new int[orderSize];
        quantities = new int[orderSize];
    }

    public void setOrderItem(int index, int productId, int quantity) {
        if (index < orderSize) {
            productIds[index-1] = productId;
            quantities[index] = quantity;
        }
    }

    public boolean processOrder(Warehouse warehouse) {

        Products product = null;
        // Check stock
        for (int i = 0; i < orderSize; i++) {
            product = warehouse.getProductById(productIds[i]);
            if (product == null) {
                System.out.println("Product ID " + productIds[i] + " not found.");
                return false;
            }
            if (product.getProductQuantity() < quantities[i]) {
                System.out.println("Insufficient stock for product ID " + productIds[i]);
                return false;
            }
        }

        // Deduct quantities
        for (int i = 0; i < orderSize; i++) {
            product.setProductprice(product.getProductQuantity() - quantities[i]) ;
        }

        System.out.println("Order processed successfully.");
        return true;
    }
}


