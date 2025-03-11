import java.util.ArrayList;

abstract class Device {

    private static final ArrayList<Device> allDevices = new ArrayList<>();
    protected final OperatingSystem os;

    public Device(OperatingSystem os) {
        this.os = os;
        Device.allDevices.add(this);
    }

    public abstract boolean isSecure();

    public abstract String toString();

    public static ArrayList<Device> getAllDevices() {
        return Device.allDevices;
    }
}
