package objectorientedprogramming.vehicletollmanagmentsystem;

public class Bike extends Vehicles{

    Bike(String numberPlate)
    {
        super(numberPlate);
    }


    @Override
    public double getTollAmount() {
        return 20;
    }
}
