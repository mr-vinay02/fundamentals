package objectorientedprogramming.vehicletollmanagmentsystem;

public class Truck extends Vehicles{

    Truck(String numberPlate)
    {
        super(numberPlate);
    }

    @Override
    public double getTollAmount() {
        return 100;
    }
}
