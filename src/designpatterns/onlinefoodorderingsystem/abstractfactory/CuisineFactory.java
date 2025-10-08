package designpatterns.onlinefoodorderingsystem.abstractfactory;

import designpatterns.onlinefoodorderingsystem.factory.Burger;
import designpatterns.onlinefoodorderingsystem.factory.Drinks;
import designpatterns.onlinefoodorderingsystem.factory.Pizza;

public interface CuisineFactory {
    Pizza createPizza(String variant);
    Burger createBurger(String variant);
    Drinks createDrink(String variant);
}
