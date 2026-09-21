class Patient {
    private int id;
    private double caffeineLevel;

    public Patient(int id, double caffeineLevel) {
        this.id = id;
        this.caffeineLevel = caffeineLevel;
    }

    public int getId() {
        return id;
    }

    public double getCaffeineLevel() {
        return caffeineLevel;
    }

    public void setCaffeineLevel(double caffeineLevel) {
        this.caffeineLevel = caffeineLevel;
    }

    @Override
    public String toString() {
        return "Patient ID: " + id + ", Caffeine Level: " + caffeineLevel;
    }
}