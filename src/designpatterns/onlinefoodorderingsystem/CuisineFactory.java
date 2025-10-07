package designpatterns.onlinefoodorderingsystem;

public interface CuisineFactory {
    Pizza createPizza(String variant);
    Burger createBurger(String variant);
    Drinks createDrink(String variant);
}
