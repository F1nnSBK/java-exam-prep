import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public record Company(List<Customer> customers, List<Employee> employees) {
    

    public double q1() {
        return employees().stream()
            .filter(emp -> emp.skills().stream()
                .anyMatch(skill -> List.of("Swift", "Java", "Kotlin").contains(skill))
            )
            .mapToDouble(Employee::salary)
            .average().getAsDouble();
    }

    public void q2() {
        employees().stream()
            .filter(emp -> emp.skills().contains("Sales"))
            .sorted((emp1, emp2) -> Double.compare(emp2.salary(), emp1.salary()))
            .limit(3)
            .forEach(emp -> {
                System.out.println("Ein kleines Danke " + emp.name() + "! Viel Spaß in der Sonne.");
            });
    }

    public Map<Character, List<Employee>> q3() {
        return employees().stream()
            .filter(emp -> !emp.skills().contains("KI"))
            .collect(Collectors.groupingBy(emp -> emp.name().charAt(0)));
    }

    public Optional<Employee> q4(String skill) {
        return employees().stream()
            .filter(e -> e.skills().contains(skill))
            .max((e1, e2) -> {
                double r2 = e2.salary() / e2.skills().size();
                double r1 = e1.salary() / e1.skills().size();
                return Double.compare(r2, r1);
            });
    }

    public List<String> q5() {
        return customers().stream()
            .filter(customer -> customer.orders().values().stream().anyMatch(sum -> sum < 100))
            .map(c -> c.name().toUpperCase())
            .distinct()
            .toList();
    }
}
