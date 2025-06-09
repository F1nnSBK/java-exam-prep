package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public record Company(List<Customer> customers, List<Employee> employees) {
    
    public double q1() {
        return employees().stream()
            .filter(e -> e.skills().stream()
                .anyMatch(skill -> List.of("Java", "Kotlin", "Swift")
                .contains(skill)))
            .mapToDouble(Employee::salary)
            .average().getAsDouble();
    }

    public void q2() {
        employees().stream()
            .filter(e -> e.skills().contains("Sales"))
            .sorted((e1, e2) -> Double.compare(e2.salary(), e1.salary()))
            .limit(3)
            .forEach(e -> {
                System.out.println("Ein kleines Danke " + e.name() + "! Viel Spaß in der Sonne.");
            });
    }

    public Map<Character, List<Employee>> q3() {
        return employees().stream()
            .filter(e -> !e.skills().contains("KI"))
            .collect(Collectors.groupingBy(e -> Character.valueOf(e.name().charAt(0))));
    }

    public Optional<Employee> q4(String skill) {
        return employees().stream()
            .filter(e -> e.skills().contains(skill))
            .max(Comparator.comparingDouble(e -> e.salary() / e.skills().size()));
    }

    public List<String> q5() {
        return customers().stream()
            .filter(c -> c.orders() != null && !c.orders().isEmpty() && c.orders().values().stream().anyMatch(orderSum -> orderSum < 100))
            .map(c -> c.name().toUpperCase())
            .distinct()
            .toList();
    }
}
