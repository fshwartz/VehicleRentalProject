package vehicles;

public class Car extends Vehicle {

    private String type;

    public Car(String licensePlate, String make, String model, double rentalPrice, String type) {
        super(licensePlate, make, model, rentalPrice);
        this.type = type;
    }

    /**
     * Calculates the rental cost for car for a given number of days.
     *
     * @param days The number of days the vehicle rented.
     * @return The total rental cost for the specified number of days.
     */
    @Override
    public double calculateRentalCost(int days) {
        return days * rentalPrice;
    }

}
