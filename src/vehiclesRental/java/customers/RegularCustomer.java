package customers;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RegularCustomer implements Customer {
    private String name;
    private List<Vehicle> rentedVehicles;


    public RegularCustomer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Processes the rental of a specific vehicle by this customer for a given number of days.
     * This method updates the customer's list of rented vehicles
     * and printed the last cost
     *
     * @param vehicle The vehicle that the customer rented.
     * @param days    The number of days the vehicle is being rented for.
     */
    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        double lastCost = vehicle.calculateRentalCost(days);
        rentedVehicles.add(vehicle);
        System.out.println("cost for: " + vehicle.getMake() +" "+vehicle.getModel()+ " for: " + days + " days is: " + lastCost);
    }

    /**
     * Retrieves the list of vehicles currently rented by this customer.
     *
     * @return List Vehicle by this customer.
     */
    @Override
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }


}
