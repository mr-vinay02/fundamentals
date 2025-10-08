package designpatterns.onlinefoodorderingsystem.abstractfactory;

import designpatterns.onlinefoodorderingsystem.factory.*;

public class ItalianFactory implements CuisineFactory {
    @Override
    public Pizza createPizza(String variant) {
        return new MargheritaPizza();
    }

    @Override
    public Burger createBurger(String variant) {
        return new VegBurger();
    }

    @Override
    public Drinks createDrink(String variant) {
        return new Coke();
    }
}
