package oopsimplementation.inventorymanagementsystem;

public class Products {
    private int productid;
    private String productName;
    private double productprice;
    private int productQuantity;

    public Products(int productid, String productName, double productprice, int productQuantity) {
        this.productid = productid;
        this.productName = productName;
        this.productprice = productprice;
        this.productQuantity = productQuantity;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductid() {
        return productid;
    }

    public double getProductprice() {
        return productprice;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductprice(double productprice) {
        this.productprice = productprice;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productid=" + productid +
                ", productName='" + productName + '\'' +
                ", productprice=" + productprice +
                ", productQuantity=" + productQuantity +
                '}';
    }
}
