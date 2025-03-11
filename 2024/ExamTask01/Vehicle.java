import java.util.ArrayList;

abstract class Vehicle {

    private static final ArrayList<Vehicle> allVehicles = new ArrayList<>();
    protected final EngineType engineType;

    public Vehicle(EngineType engineType) {
        this.engineType = engineType;
        Vehicle.allVehicles.add(this);
    }

    public abstract boolean readyForUse();

    public static ArrayList<Vehicle> getAllVehicles() {
        return Vehicle.allVehicles;
    }
}
