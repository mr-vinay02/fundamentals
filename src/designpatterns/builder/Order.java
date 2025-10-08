package designpatterns.builder;

public class Order {

//    Mandatory Fields
    private String customerName;
    private String product;

    // constructor for the Mandatory Fields
    public Order(String customerName, String product) {
        this.customerName = customerName;
        this.product = product;
    }

    //    Optional Feilds
    private String couponCode;
    private double discount;
    private String shippingAddress;
    private boolean giftWrap;

    // constructor using the builder
    private Order(OrderBuilder builder){
        this.customerName = builder.customerName;
        this.product = builder.product;
        this.couponCode = builder.couponCode;
        this.discount = builder.discount;
        this.shippingAddress = builder.shippingAddress;
        this.giftWrap = builder.giftWrap;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerName='" + customerName + '\'' +
                ", product='" + product + '\'' +
                ", couponCode='" + couponCode + '\'' +
                ", discount=" + discount +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", giftWrap=" + giftWrap +
                '}';
    }

    // for the building the complex order
    static class OrderBuilder{

        private String customerName;
        private String product;
        //    Optional Feilds
        private String couponCode;
        private double discount;
        private String shippingAddress;
        private boolean giftWrap;

        public OrderBuilder(String customerName, String product) {
            this.customerName = customerName;
            this.product = product;
        }

        public OrderBuilder setCouple(String couponCode){
            this.couponCode = couponCode;
            return this;
        }

        public OrderBuilder setAddress(String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public OrderBuilder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public OrderBuilder setGiftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public Order build (){
            return new Order(this);
        }
    }
}
