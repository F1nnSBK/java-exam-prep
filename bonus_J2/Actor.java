import java.time.LocalDate;
import java.util.List;

public record Actor(String name, LocalDate birthDate, List<String> genres) {
}