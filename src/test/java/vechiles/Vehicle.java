package vechiles;

public abstract class Vehicle {
    private String licensePlate;
    private String make;
    private String model;
    protected double rentalPrice;

    public Vehicle(String licensePlate, String make, String model, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    /**
     * Calculates the rental cost for this vehicle for a given number of days.
     * This is an abstract method and must be implemented by concrete subclasses
     *
     * @param days The number of days the vehicle rented.
     * @return The total rental cost for the specified number of days.
     */
    public abstract double calculateRentalCost(int days);

}
