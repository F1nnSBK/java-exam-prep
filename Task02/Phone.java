public class Phone extends Device {

    private boolean encrypted;

    public Phone(OperatingSystem os, boolean encrypted) {
        super(os);
        this.encrypted = encrypted;
    }

    public boolean isSecure() {
        return this.encrypted == true || this.os == os.IOS;
    }

    public String toString() {
        return (
            "Phone, ist verschlüsselt: " +
            this.encrypted +
            ", ist sicher: " +
            this.isSecure() +
            ", os=" +
            this.os
        );
    }
}
