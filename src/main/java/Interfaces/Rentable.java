package Interfaces;

import Users.Customer;

public interface Rentable {

    public void rent(Customer customer, int days);

    public void returnVehicle();

}


