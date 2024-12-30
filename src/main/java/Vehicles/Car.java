package Vehicles;

import Users.Customer;

public class Car extends Vehicle{
    private boolean hasAC;
    private int passengerCapacity;



public Car(String vehicleID, String model, double baseRentalRate, boolean isAvailable, boolean hasAC, int passengerCapacity){
    super(vehicleID, model, 300.0, isAvailable);
    this.hasAC = hasAC;
    this.passengerCapacity = passengerCapacity;
}

    public boolean getHasAC(){
    return hasAC;
    }
    public void setHasAC(boolean hasAC){
    this.hasAC = hasAC;
    }
    public int getPassengerCapacity(){
    return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity){
    this.passengerCapacity = passengerCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
    double cost = 300 * days;
    if (hasAC){ cost += 50 * days;}
    if (passengerCapacity > 5){cost += 30;}
    System.out.println(cost);
    return cost;
    }

    @Override
    public boolean isAvailableForRental() {
    return getIsAvailable();
}

    public void rent(Customer customer, int days){
        if(getIsAvailable()){setIsAvailable(false);
            calculateRentalCost(days);
            System.out.println("This vehicle is now rented by" + customer.getName());}
        else {System.out.println("Vehicle is not available for rent");};
    };

}
