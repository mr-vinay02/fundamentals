package designpatterns.onlinefoodorderingsystem;

public class MargheritaPizza extends Pizza{
    @Override
    public String getName() {
        return "Margherita Pizza";
    }

    @Override
    public double getPrice() {
        return 8.5;
    }

    @Override
    public String getDescription() {
        return "Classic cheese & tomato";
    }
}
