package vechiles;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }

    @Override
    //Calculate rental price by 50 units for every 10 tons above a hundred
    public double calculateRentalCost(int days) {
        double capacityPrice = 0;
        for (int i = capacity - 100; i > 0; i -= 10) {
            capacityPrice += 50;
        }
        return rentalPrice * days + capacityPrice;
    }

}
