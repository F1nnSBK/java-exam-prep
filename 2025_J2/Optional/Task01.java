package Optional;
import java.util.Optional;

public class Task01 {
    public static void main(String[] args) {
        Car bmw = new Car("Bmw", "320i", new Driver("Steffen"));
        System.out.println(bmw.owner());
        bmw.owner().driverLicence = Optional.of("B");
        System.out.println(bmw.owner().isAllowedToDrive());
    }
}
