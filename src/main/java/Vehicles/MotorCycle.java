package Vehicles;

import Users.Customer;

public class MotorCycle extends Vehicle{
    private boolean offRoadCapability;


    public MotorCycle(String vehicleID, String model, double baseRentalRate, boolean isAvailable, boolean offRoadCapability){
        super(vehicleID, model, 150.0, isAvailable);
        this.offRoadCapability = offRoadCapability;
    }


    public boolean getOffRoadCapability(){
        return offRoadCapability;
    }

    public void setOffRoadCapability(boolean offRoadCapability){
        this.offRoadCapability = offRoadCapability;
    }

    @Override
    public double calculateRentalCost(int days) {
    double cost = 150 * days;
    if(offRoadCapability){ cost += 70 * days;}
    System.out.println(cost);
    return cost;
    }

    public void rent(Customer customer, int days){
        if(getIsAvailable()){setIsAvailable(false);
            calculateRentalCost(days);
            System.out.println("This vehicle is now rented by" + customer.getName());}
        else {System.out.println("Vehicle is not available for rent");};
    };

    @Override
    public boolean isAvailableForRental() {
    return getIsAvailable();
    }

}
