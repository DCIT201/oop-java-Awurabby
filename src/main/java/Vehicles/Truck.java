package Vehicles;

import Users.Customer;

public class Truck extends Vehicle{

        private double loadCapacity;
        private boolean canTow;

    public Truck(String vehicleID, String model, double baseRentalRate, boolean isAvailable, double loadCapacity, boolean canTow){
        super(vehicleID, model, 600.0, isAvailable);
        this.loadCapacity = loadCapacity;
        this.canTow = canTow;
    }

    @Override
    public double calculateRentalCost(int days) {
    double cost = 600 * days;
    if(loadCapacity > 1000){cost+= 40 * days;}
    if(canTow){cost += 200 * days;}
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

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public boolean getCanTow() {
        return canTow;
    }

    public void setCanTow(boolean canTow) {
        this.canTow = canTow;
    }

}
