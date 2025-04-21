import customers.CorporateCustomer;
import customers.RegularCustomer;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;
import java.util.List;

public class VehicleRental {

    public static void main(String[] args) {
        Car car1 = new Car("license111", "Toyota", "model111", 70.00, "special");
        Car car2 = new Car("license222", "Hondo", "model222", 60, "personal");
        Truck truck1 = new Truck("license333", "Hino", "model333", 180, 110);
        Truck truck2 = new Truck("license444", "Ford", "model444", 100, 300);

        RegularCustomer regularCustomer1 = new RegularCustomer("Ronen Sharabi");
        RegularCustomer regularCustomer2 = new RegularCustomer("Eli Cohen");
        CorporateCustomer corporateCustomer1 = new CorporateCustomer("Verisoft");
        CorporateCustomer corporateCustomer2 = new CorporateCustomer("Matrix");

        //example 1
        corporateCustomer1.rentVehicle(car1, 1);
        corporateCustomer1.rentVehicle(truck1, 2);
        corporateCustomer1.rentVehicle(truck2,5);
        List<Vehicle> vehicleList1 = corporateCustomer1.getRentedVehicles();
        System.out.println(corporateCustomer1.getName() +" rented total: "+vehicleList1.size()+" vehicles");

        //example 2
        regularCustomer1.rentVehicle(truck1, 1);
        regularCustomer1.rentVehicle(truck2, 4);
        regularCustomer1.rentVehicle(car2, 7);
        List<Vehicle> vehicleList2 = regularCustomer1.getRentedVehicles();
        System.out.println(regularCustomer1.getName() +" rented total: "+vehicleList2.size()+" vehicles");

        //example 3
        regularCustomer2.rentVehicle(car2, 2);
        List<Vehicle> vehicleList3 = regularCustomer2.getRentedVehicles();
        System.out.println(regularCustomer2.getName() +" rented total: "+vehicleList3.size()+" vehicles");

        //example 4
        corporateCustomer2.rentVehicle(truck1, 3);
        corporateCustomer2.rentVehicle(truck2, 2);
        List<Vehicle> vehicleList4 = corporateCustomer2.getRentedVehicles();
        System.out.println(corporateCustomer2.getName() +" rented total: "+vehicleList4.size()+" vehicles");

    }

}
