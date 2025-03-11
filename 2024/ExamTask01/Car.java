public class Car extends Vehicle {

    private int fuelLevel;

    public Car(EngineType engineType, int fuelLevel) {
        super(engineType);
        this.fuelLevel = fuelLevel;
    }

    public boolean readyForUse() {
        return this.fuelLevel > 0;
    }
}
