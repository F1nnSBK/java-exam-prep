import java.util.List;
import java.util.Map;

public record Movie(String title, int year, double rating, List<Actor> cast, Map<String, Double> boxOfficeByRegion) {
    
    
}
