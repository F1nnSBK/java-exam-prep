package Streams;

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record University(List<Professor> professors, List<Student> students) {
    
    public List<Double> q1() {
        return students().stream()
            .map(s -> {
                Map<String, Double> studentGrades = s.grades();
                OptionalDouble averageGradeOptional = studentGrades.values().stream()
                                                        .mapToDouble(Double::doubleValue)
                                                        .average();
                return averageGradeOptional.orElse(0.0);
            })
            .toList();
    }

    public void q2() {
        professors().stream()
            .filter(p -> p.courses().stream().anyMatch(c -> c.equalsIgnoreCase("Math")))
            .sorted((p1, p2) -> Integer.compare(p2.age(), p1.age()))
            .limit(3)
            .forEach(p -> System.out.println("6138 Minuten Bazinga Spaß an dich " + p.name() + "."));
    }

    public Map<Integer, List<Professor>> q3() {
        return professors().stream()
            .filter(p -> p.courses().size() <= 2)
            .collect(Collectors.groupingBy(c -> c.age()));
    }

    public List<List<Student>> q4(String professorName) {
        return professors().stream()
            .filter(p -> p.name().equals(professorName))
            .map(p -> students.stream()
                .filter(s -> s.grades().keySet().stream()
                    .anyMatch(sC -> p.courses().stream()
                        .anyMatch(pC -> sC.equals(pC))))
                .toList())
            .toList();
    }

    public List<String> q5() {
        return students().stream()
            .filter(s -> s.grades().values().stream()
                .anyMatch(sG -> sG >= 1.5))
            .map(s -> s.name().toLowerCase())
            .distinct()
            .toList();
    }

}
