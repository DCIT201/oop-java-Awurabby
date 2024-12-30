package Users;

import Models.RentalTransaction;
import Vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private String email;
    private List<Vehicle> currentRentals;
    private List<RentalTransaction> rentalHistory;

    public Customer(String customerId, String name, String email){
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.currentRentals = new ArrayList<>();
        this.rentalHistory = new ArrayList<>();
    }


    public boolean isEligibleToRent(){
        return currentRentals.size() < 4;
    }

   /* public void rentVehicle(Vehicle vehicle, Customer customer, int days, double totalCost, String transactionId){
        if(isEligibleToRent()){
            RentalTransaction transaction = new RentalTransaction(transactionId, vehicle, customer, days, totalCost);
            rentalHistory.add(transaction);
            currentRentals.add(vehicle);
            vehicle.rent(customer, days);
        }
    }*/

    public void returnVehicle(Vehicle vehicle){
        currentRentals.remove(vehicle);
        vehicle.returnVehicle();
    }



    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Vehicle> getCurrentRentals() {
        return currentRentals;
    }
    public void setCurrentRentals(List<Vehicle> currentRentals) {
        this.currentRentals = currentRentals;
    }
    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
    public void setRentalHistory(List<RentalTransaction> rentalHistory) {
        this.rentalHistory = rentalHistory;
    }
}
