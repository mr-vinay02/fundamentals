package designpatterns.builder;

public class MakeOrder {

    public static void main(String[] args) {

        Order order1 = new Order.OrderBuilder("Vinay" , "Mobile")
                .setGiftWrap(true)
                .setAddress("vidyanagar , davangere")
                .setDiscount(10.0)
                .setCouple("NEWVINAY50")
                .build();

        System.out.println(order1);

        Order order2 = new Order.OrderBuilder("VIJAY" , "LAPTOP")
                .setDiscount(0.0)
                .setCouple("NEWVIJAY50")
                .build();

        System.out.println(order2);
    }
}
