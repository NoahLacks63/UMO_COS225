public class ParkingTester {
    public static void main(String[] args) {
        // Instantiate a ParkingLot
        ParkingLot lot = new ParkingLot();

        // “Print” the ParkingLot by calling its ToString() method
        System.out.println(lot);

        // Instantiate a Car that represents a “Blue Ford”, with handicap accessible tags
        Car car1 = new Car("Ford", "Blue", true);

        // Park this Car in the ParkingLot
        lot.parkCar(car1);

        // “Print” the ParkingLot by calling its ToString() method
        System.out.println(lot);

        // Instantiate a Car entirely that represents a “Black Mazda”, non-handicap
        Car car2 = new Car("Mazda", "Black", false);

        // Park this Car in the ParkingLot
        lot.parkCar(car2);

        // “Print” the ParkingLot by calling its ToString() method
        System.out.println(lot);

        // Remove the first Car (the Ford) from the ParkingLot
        lot.removeCar(0);

        // “Print” the ParkingLot by calling its ToString() method
        System.out.println(lot);
    }
}
