public class ExamTask02 {

    public static void main(String[] args) {
        new Phone(OperatingSystem.ANDROID, false);
        new Phone(OperatingSystem.IOS, false);
        new Laptop(OperatingSystem.LINUX, 11);
        new Laptop(OperatingSystem.WINDOWS, 11);

        int safePhones = 0;
        int safeLaptops = 0;
        for (Device device : Device.getAllDevices()) {
            if (device instanceof Phone && device.isSecure() == true) {
                safePhones++;
            }
            if (device instanceof Laptop && device.isSecure() == true) {
                safeLaptops++;
            }
        }
        System.out.println(
            "Laptops: " + safeLaptops + " Phones: " + safePhones
        );
    }
}
