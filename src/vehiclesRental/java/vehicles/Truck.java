package vehicles;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }

    /**
     * Calculates the rental cost for truck for a given number of days.
     * Calculate cost by 50 units for every 10 tons above a hundred
     *
     * @param days The number of days the vehicle rented.
     * @return The total rental cost for the specified number of days.
     */
    @Override
    public double calculateRentalCost(int days) {
        double capacityPrice = 0;
        for (int i = capacity - 100; i > 0; i -= 10) {
            capacityPrice += 50;
        }
        return rentalPrice * days + capacityPrice;
    }

}
