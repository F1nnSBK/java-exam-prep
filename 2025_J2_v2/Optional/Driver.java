package Optional;

import java.util.Optional;

public class Driver {
    public String name;
    public Optional<String> driverLicence;

    public Driver(String name) {
        this(name, null);
    }

    public Driver(String name, String driverLicence) {
        this.name = name;
        this.driverLicence = Optional.ofNullable(driverLicence);
    }

    public String toString() {
        return name + " " + (driverLicence.isPresent() ? driverLicence.get() : "");
    }

    public boolean isAllowedToDrive() {
        return driverLicence.isPresent() && driverLicence.get().equals("B");
    }
}
