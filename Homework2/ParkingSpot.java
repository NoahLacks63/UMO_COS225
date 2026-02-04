public class ParkingSpot {
    private Car parkedCar;
    private boolean isHandicap;

    public ParkingSpot(boolean isHandicap) {
        this.isHandicap = isHandicap;
    }

    public boolean isHandicap() {
        return isHandicap;
    }

    public Car getCar() {
        return parkedCar;
    }

    public void setCar(Car car) {
        this.parkedCar = car;
    }
}
