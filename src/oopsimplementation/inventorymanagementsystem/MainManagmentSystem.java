package oopsimplementation.inventorymanagementsystem;

public class MainManagmentSystem {
    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse(5);

        warehouse1.addProducts(new Products(101,"laptop",55000,5));
        warehouse1.addProducts(new Products(102,"Mouse",999,3));
        warehouse1.addProducts(new Products(103,"Mobile",1999,2));
        warehouse1.addProducts(new Products(104,"EarBuds",3999,1));

        warehouse1.displayProducts();

        Orders order1 = new Orders(2);

        order1.setOrderItem(1,101,2);
        order1.setOrderItem(2,102,1);

        order1.processOrder(warehouse1);



    }
}
