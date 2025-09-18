package objectorientedprogramming.vehicletollmanagmentsystem;

public class Car extends Vehicles{

    public Car(String numberPlate)
    {
        super(numberPlate);
    }

    @Override
    public double getTollAmount() {
        return 50;
    }
}
