package objectorientedprogramming.vehicletollmanagmentsystem;

public class MainVehiclesSystem {

    public static void main(String[] args) {


        //     for the bikes
        Vehicles bike = new Bike("KA 17 EW 4978");
        System.out.println(bike.getNumberPlate());
        System.out.println(bike.getTollAmount());


        // for the car
        Vehicles car = new Car("KA 01 NA 8055");
        System.out.println(car.getNumberPlate());
        System.out.println(car.getTollAmount());

        // for the Truck
        Vehicles truck = new Truck("KA 01 NA 8055");
        System.out.println(truck.getNumberPlate());
        System.out.println(truck.getTollAmount());

    }
}
