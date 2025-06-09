package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class PhoneStore {
    private ArrayList<Phone> phones;
    
    public PhoneStore(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    public List<Phone> q1() {
        return phones.stream()
            .filter(p -> p.brand() == Brand.HUAWEI && p.cameras() > 3)
            .sorted(Comparator.comparing(Phone::cpuPower).reversed())
            .limit(3)
            .sorted(Comparator.comparing(Phone::price).reversed())
            .toList();
    }

    public OptionalDouble q2() {
        return phones.stream()
            .filter(p -> p.batterySize() >= 2500)
            .mapToInt(Phone::cameras)
            .average();
    }

    public List<Phone> q3(double maxPrice) {
        return  phones.stream()
            .filter(p -> p.price() < maxPrice)
            .filter(p -> p.connectionType().isModern())
            .filter(p -> p.cpuPower() < 2400)
            .sorted(Comparator.comparing(Phone::price))
            .toList();
    }

    public Map<String, Phone> q4() {
        return phones.stream()
            .collect(Collectors.toMap(
                p -> p.brand().name() + " " + p.connectionType().name(),
                p -> p
            ));
    }

    public Map<ConnectionType, List<Phone>> q5() {
        return phones.stream()
            .collect(Collectors.groupingBy(Phone::connectionType));
    }
}
