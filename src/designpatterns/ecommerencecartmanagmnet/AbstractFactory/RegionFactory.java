package designpatterns.ecommerencecartmanagmnet.AbstractFactory;

import designpatterns.ecommerencecartmanagmnet.factory.Product;

public interface RegionFactory {

    Product createElectronics();
    Product createClothing();
    Product createBook();

}
