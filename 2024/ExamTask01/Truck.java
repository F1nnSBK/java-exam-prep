public class Truck extends Vehicle {

    private static final int MAXIMUM_ALLOWED_WEIGHT = 7500;
    private int weight;

    public Truck(EngineType engineType, int weight) {
        super(engineType);
        this.weight = weight;
    }

    public boolean readyForUse() {
        return this.weight <= Truck.MAXIMUM_ALLOWED_WEIGHT;
    }
}
