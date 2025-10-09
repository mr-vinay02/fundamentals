package designpatterns.ecommerencecartmanagmnet.abstractfactory;

import designpatterns.ecommerencecartmanagmnet.factory.Product;

public interface RegionFactory {

    Product createElectronics();
    Product createClothing();
    Product createBook();

}
