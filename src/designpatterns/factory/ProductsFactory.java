package designpatterns.factory;

public class ProductsFactory {

    public static Products createProduct(String productType){

        switch (productType.toLowerCase()){

            case "electronics" :
                return new Electrnoics();

            case "clothing" :
                return new Clothing();

            case "grocery" :
                return new Grocery();

            default:
                throw new IllegalArgumentException("Unknown product type: " + productType);


        }
    }

}
