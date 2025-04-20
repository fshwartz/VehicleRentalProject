package customers;

import vechiles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class RegularCustomer implements Customer {
    private String name;
    private List<Vehicle> rentedVehicles;

    private double lastCost;


    public RegularCustomer(String name) {
        this.name = name;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        lastCost = vehicle.calculateRentalCost(days);
        rentedVehicles.add(vehicle);
    }

    @Override
    public List<Vehicle> getRentedVehicles() {
        return rentedVehicles;
    }

    public double getLastCost()
    {
        return lastCost;
    }


}
