public class Car {
    private String make;
    private String color;
    private boolean isHandicap;

    public Car(String make, String color, boolean isHandicap) {
        this.make = make;
        this.color = color;
        this.isHandicap = isHandicap;
    }

    public boolean isHandicap() {
        return isHandicap;
    }
}