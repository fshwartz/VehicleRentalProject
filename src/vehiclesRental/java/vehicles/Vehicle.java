package vehicles;

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

    /**
     * this method return licensePlate for vehicle
     * @return licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * this method return make for vehicle
     * @return model
     */
    public String getMake() {
        return make;
    }

    /**
     * this method return model for vehicle
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * this method return rental price for this vehicle
     * @return rentalPrice
     */
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
