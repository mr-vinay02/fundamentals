package oopsimplementation.inventorymanagementsystem;

import oopsimplementation.arrayimplementation.MyArray;

public class Warehouse {
    private int productCount =0;
    private Products[] products;
    private int capacity;

    public Warehouse(int capacity) {
        products = new Products[capacity];
        this.capacity = capacity;
    }

    public void addProducts(Products product)
    {
        if(productCount > capacity)
            System.out.println("WareHouse is Full,Can't add products!!!!!");
        else{
            products[productCount++] = product;
            System.out.println("Product added successfully....");
        }

    }

    public Products getProductById(int id)
    {
        for(Products products1 : products)
        {
            if( id == products1.getProductid())
                return products1;
        }
        return null;
    }

    public void displayProducts()
    {
        System.out.println("Displaying all products....");
        for(Products products1 : products){
            System.out.println(products1);
        }
    }

    public void updateProduct(Products products1)
    {
        Products updateProduct= null;
        for(Products products2 : products)
        {
            if(products2.getProductid() == products1.getProductid())
                updateProduct = products2;
        }
        updateProduct.setProductName(products1.getProductName());
        updateProduct.setProductprice(products1.getProductprice());
        updateProduct.setProductQuantity(products1.getProductQuantity());

        System.out.println("Product Updated successfully.....");
    }
}
