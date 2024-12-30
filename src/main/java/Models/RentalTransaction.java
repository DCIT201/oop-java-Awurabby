package Models;

import Users.Customer;
import Vehicles.Vehicle;

public class RentalTransaction {
    private String transactionId;
    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private double totalCost;

    public RentalTransaction(String transactionId, Vehicle vehicle, Customer customer, int days, double totalCost) {
        this.transactionId = transactionId;
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.totalCost = totalCost;
    }

    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    public double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public void printTransactionDetails(){
        System.out.println("Transaction Id:" + transactionId);
        System.out.println("Vehicle:" + vehicle.getModel());
        System.out.println("Customer:" + customer.getName());
        System.out.println("Days:"+ days);
        System.out.println("Total Cost:" + totalCost);
    }


}















// cut to rental agency
// public void addVehicle(Vehicle vehicle) {
//        vehicleFleet.add(vehicle);
//    }
//
//    public void processRental(Customer customer, String vehicleID, int days) {
//        for (Vehicle vehicle : vehicleFleet) {
//            if (vehicle.vehicleID.equals(vehicleID) && vehicle.isAvailableForRental()) {
//                vehicle.rent(customer, days);
//                RentalTransaction transaction = new RentalTransaction(vehicle, customer, days);
//                transaction.printTransactionDetails();
//                return;
//            }
//        }
//        System.out.println("Vehicle not available or not found.");
//    }
//
//    public void returnVehicle(String vehicleID) {
//        for (Vehicle vehicle : vehicleFleet) {
//            if (vehicle.vehicleID.equals(vehicleID) && !vehicle.isAvailableForRental()) {
//                vehicle.returnVehicle();
//                return;
//            }
//        }
//        System.out.println("Vehicle not found or already available.");
//    }
//}