package designpatterns.onlinefoodorderingsystem.abstractfactory;

import designpatterns.onlinefoodorderingsystem.factory.*;

public class IndianFactory implements CuisineFactory {
    @Override
    public Pizza createPizza(String variant) {
        return new PaneerTikkaPizza();
    }

    @Override
    public Burger createBurger(String variant) {
        return new MasalaBurger();
    }

    @Override
    public Drinks createDrink(String variant) {
        return new MasalaChai();
    }
}
