package customers;

import vechiles.Vehicle;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface Customer {
    String getName();

    void rentVehicle(Vehicle vehicle, int days);

    List<Vehicle> getRentedVehicles();

    double getLastCost();

}
