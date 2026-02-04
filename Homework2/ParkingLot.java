public class ParkingLot {
    /** The total number of parking spots in the lot */
    private static final int TOTAL_SPOTS = 8;

    /** The array of parking spots in the lot */
    private ParkingSpot[] spots;

    /** 
     * Constructs a ParkingLot with a predefined number of parking spots.
     * The first two spots are designated as handicap accessible.
     */
    public ParkingLot() {
        spots = new ParkingSpot[TOTAL_SPOTS];

        // Creates TOTAL_SPOTS parking spots, first two are handicap
        for (int i = 0; i < TOTAL_SPOTS; i++) {
            spots[i] = new ParkingSpot(i < 2);
        }
    }

    /**
     * Parks a car in the first available spot that matches its handicap status.
     * 
     * @param car The car to be parked.
     * @return The index of the parking spot where the car was parked, or -1 if no spot was available.
     */
    public int parkCar(Car car) {
        int i = 0;
        if (!car.isHandicap()) {
            i = 2;
        }

        for (; i < TOTAL_SPOTS; i++) {
            if (spots[i].getCar() == null) {
                spots[i].setCar(car);
                return i;
            }
        }

        return -1; // No available spot found
    }

    /**
     * Removes the car from a parking spot and returns the car.
     * 
     * @param spotIndex The index of the parking spot to remove the car from.
     * @return The car that was removed from the parking spot.
     */
    public Car removeCar(int spotIndex) {
        Car removedCar = spots[spotIndex].getCar();
        spots[spotIndex].setCar(null);

        return removedCar;
    }

    /**
     * Returns a string representation of the parking lot's available spots.
     */
    @Override
    public String toString() {
        int available = 0;
        int availableHandicap = 0;

        for (ParkingSpot spot : spots) {
            if (spot.getCar() == null) {
                if (spot.isHandicap()) {
                    availableHandicap++;
                } else {
                    available++;
                }    
            }
        }

        return "Available Handicap Spots: " + availableHandicap 
            + " | Available Spots: " + available;
    }
}