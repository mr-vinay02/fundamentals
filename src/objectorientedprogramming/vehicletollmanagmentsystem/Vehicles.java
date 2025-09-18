package objectorientedprogramming.vehicletollmanagmentsystem;

abstract class Vehicles{

     private String numberPlate;

     public Vehicles(String numberPlate) {
          this.numberPlate = numberPlate;
     }

     public String getNumberPlate(){
          return numberPlate;
     }

     public abstract double getTollAmount() ;
}
