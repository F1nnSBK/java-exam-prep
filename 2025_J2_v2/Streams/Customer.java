import java.util.Map;

public record Customer(String name, int yearOfFirstOrder, Map<Integer, Double> orders) {
    
}
