public class Laptop extends Device {

    private static int MINIMUM_VERSION = 22;
    private int version;

    public Laptop(OperatingSystem os, int version) {
        super(os);
        this.version = version;
    }

    public boolean isSecure() {
        if (this.os != os.WINDOWS) {
            return true;
        } else if (this.os == os.WINDOWS) {
            if (this.version > Laptop.MINIMUM_VERSION) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return (
            "Laptop, Version: " +
            this.version +
            ", ist sicher: " +
            this.isSecure() +
            ", os=" +
            this.os
        );
    }
}
