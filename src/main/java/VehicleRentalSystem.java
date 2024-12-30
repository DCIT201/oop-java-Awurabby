import Vehicles.Car;
import Users.Customer;
import Users.RentalAgency;
import Vehicles.Vehicle;

public class VehicleRentalSystem {

    public static void main(String[] args){
        // to create a rental agency
        RentalAgency agency = new RentalAgency();

        //adding vehicles to the fleet
        Vehicle car1 = new Car("1", "Nissan290", 300, true, true, 5);
        agency.addVehicle(car1);

        //to create a new customer
        Customer customer1 = new Customer("1", "Adwoa Mensah", "adwoamensah@yahoomail.com");

        // to process rental
        agency.processRental(car1, customer1, 1);
    }
}
