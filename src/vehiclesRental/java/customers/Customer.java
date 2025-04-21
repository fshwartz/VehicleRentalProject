package customers;

import vehicles.Vehicle;

import java.util.List;

public interface Customer {
    String getName();
    /**
     * Processes the rental of a specific vehicle by this customer for a given number of days.
     * This method updates the customer's list of rented vehicles
     *
     * @param vehicle The vehicle that the customer rented.
     * @param days The number of days the vehicle is being rented for.
     */
    void rentVehicle(Vehicle vehicle, int days);
    /**
     * Retrieves the list of vehicles currently rented by this customer.
     * @return List Vehicle by this customer.
     */
    /**
     * Retrieves the list of vehicles currently rented by this customer.
     * @return List Vehicle by this customer.
     */
    List<Vehicle> getRentedVehicles();

}
