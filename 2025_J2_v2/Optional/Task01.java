package Optional;

import java.util.Optional;

public class Task01 {

    public static void main(String[] args) {

        Car bmwCar = new Car("bmw", "320i", new Driver("Steffen"));
        System.out.println(bmwCar.owner().toString());
        bmwCar.owner().driverLicence = Optional.of("B");
        if (bmwCar.owner().isAllowedToDrive()) {
            System.out.println(bmwCar.owner().toString());
        }

    }

}
