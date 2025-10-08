package designpatterns.onlinefoodorderingsystem.factory;

public class FoodFactory {

    public static FoodItem create (String category , String variant){

        switch (category){

            case "Pizza" :
                if(variant.equalsIgnoreCase("margherita"))
                    return new MargheritaPizza();
                else
                    return new PaneerTikkaPizza();

            case "Burger":
                if(variant.equalsIgnoreCase("masalaburger"))
                    return new MasalaBurger();
                else
                    return new VegBurger();

            case "Drinks":
                if(variant.equalsIgnoreCase("masalaChai"))
                    return new MasalaChai();
                else
                    return new Coke();
        }
        throw new IllegalArgumentException("Unknown food item: " + category + " / " + variant);
    }
}
