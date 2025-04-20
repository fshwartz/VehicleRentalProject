import customers.CorporateCustomer;
import customers.Customer;
import customers.RegularCustomer;
import vechiles.Car;
import vechiles.Truck;
import vechiles.Vehicle;
import java.util.HashMap;
import java.util.Map;

public class VehicleRental {

    public static void main(String[] args) {
        Car car1 = new Car("license111", "Toyota", "model111", 70.00, "special");
        Car car2 = new Car("license222", "Hondo", "model222", 60, "personal");
        Truck truck1 = new Truck("license333", "Hino", "model333", 180, 110);
        Truck truck2 = new Truck("license444", "Ford", "model444", 100, 300);

        RegularCustomer regularCustomer1 = new RegularCustomer("Ronen Sharabi");
        CorporateCustomer corporateCustomer1 = new CorporateCustomer("Verisoft");

        //example 1
        corporateCustomer1.rentVehicle(car1, 1);
        corporateCustomer1.rentVehicle(truck1, 2);

        System.out.println(corporateCustomer1.getName() + " has to pay: " + corporateCustomer1.getLastCost());

        //example 2
        regularCustomer1.rentVehicle(truck1, 1);
        System.out.println(regularCustomer1.getName() + " has to pay: " + regularCustomer1.getLastCost());

        //example 3
        corporateCustomer1.rentVehicle(car2, 2);
        System.out.println(corporateCustomer1.getName() + " has to pay: " + corporateCustomer1.getLastCost());

        //example 4
        //regular customer
        Map<Vehicle, Double> allVehicleRegularCustomer = new HashMap<>();
        corporateCustomer1.rentVehicle(car1,3);
        allVehicleRegularCustomer.put(car1, regularCustomer1.getLastCost());
        allVehicleRegularCustomer.put(car1, car1.calculateRentalCost(1));
        allVehicleRegularCustomer.put(car2, car2.calculateRentalCost(4));
        allVehicleRegularCustomer.put(truck1, truck1.calculateRentalCost(2));
        allVehicleRegularCustomer.put(truck2, truck2.calculateRentalCost(1));

        double total1 = 0;
        for (Vehicle vehicle : allVehicleRegularCustomer.keySet()) {
            double price = allVehicleRegularCustomer.get(vehicle);
            System.out.println(regularCustomer1.getName() + " has to pay: " + price + " for: " + vehicle.getModel());
            total1 += price;
        }
        System.out.println("Total: " + regularCustomer1.getName() + " has to pay: " + total1);

    }

}
