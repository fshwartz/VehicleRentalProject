package customers;

import vechiles.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CorporateCustomer implements Customer {

    private String companyName;
    private List<Vehicle> rentedVehicles;
    private double lastCost;

    public CorporateCustomer(String companyName) {
        this.companyName = companyName;
        this.rentedVehicles = new ArrayList<>();
    }

    @Override
    public String getName() {
        return companyName;
    }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        lastCost = vehicle.calculateRentalCost(days) * (0.9);
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
