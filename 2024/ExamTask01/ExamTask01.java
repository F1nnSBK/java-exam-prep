public class ExamTask01 {

    public static void main(String[] args) {
        new Car(EngineType.ELECTRO, 0);
        new Car(EngineType.PETROL, 50);
        new Truck(EngineType.DIESEL, 6000);
        new Truck(EngineType.HYDROGEN, 1500);
        int readyVehicles = 0;
        for (Vehicle vehicle : Vehicle.getAllVehicles()) {
            if (vehicle instanceof Car || vehicle instanceof Truck) {
                if (vehicle.readyForUse() == true) {
                    readyVehicles++;
                }
            }
        }
        System.out.println("Fahrzeuge bereit: " + readyVehicles);
    }
}
