package Vehicles;


import Interfaces.Rentable;
import Users.Customer;

public abstract class Vehicle implements Rentable {
    private String vehicleID;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;



    public Vehicle(String vehicleID, String model, double baseRentalRate, boolean isAvailable){
        if (vehicleID == null || vehicleID.trim().isEmpty()){
            System.out.println("This is an invalid Id. It will be stored as INVALID ID");
            this.vehicleID = "INVALID ID";
        } else {this.vehicleID = vehicleID;}


        
        if (model == null || model.trim().isEmpty()){
            System.out.println("This is an invalid model. Defaulting to INVALID MODEL");
            this.model = "INVALID MODEL";
        } else {this.model = model;}


        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }


    public String  getVehicleID(){
        return vehicleID;
    }
    public void setVehicleID(String vehicleID){
        this.vehicleID = vehicleID;
    }
    public String  getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public double getBaseRentalRate(){
        return baseRentalRate;
    }
    public void setBaseRentalRate(double baseRentalRate){
        this.baseRentalRate = baseRentalRate;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }

    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();


    @Override
    public void rent(Customer customer, int days){
        if(isAvailable){isAvailable = false; System.out.println("This vehicle is now rented");}
        else {System.out.println("Vehicle is not available for rent");};
    };


    @Override
    public void returnVehicle(){
        isAvailable = true; System.out.println("Vehicle has been returned successfully");
    };
}
