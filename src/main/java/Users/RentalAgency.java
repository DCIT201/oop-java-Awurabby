package Users;

import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicleFleet;

    public RentalAgency(List<Vehicle> vehicleFleet){this.vehicleFleet = new ArrayList<>();}

public RentalAgency(){}

    public void addVehicle(Vehicle vehicle){
        this.vehicleFleet.add(vehicle);
    }



    public List<Vehicle> getVehicleFleet() {
        return vehicleFleet;
    }
    public void setVehicleFleet(List<Vehicle> vehicleFleet) {
        this.vehicleFleet = vehicleFleet;
    }


    public void processRental(Vehicle vehicle, Customer customer, int days/* String transactionId, , double totalCost*/){
        if(vehicle.isAvailableForRental()){
            vehicle.rent(customer, days);
           // System.out.println("Rental processed for:" + customer.getName());
        } else {System.out.println("Rental process failed: Vehicle is not available.");}

    }

    public void generateReport(){
        System.out.println("Generating report......");
    }
}

