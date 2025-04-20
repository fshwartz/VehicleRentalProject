package vechiles;

public class Car extends Vehicle {

    private String type;

    public Car(String licensePlate, String make, String model, double rentalPrice, String type) {
        super(licensePlate, make, model, rentalPrice);
        this.type = type;
    }

    @Override
    public double calculateRentalCost(int days) {

        return days * rentalPrice;
    }

}
