import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public record MovieAnalytics(List<Movie> movies, List<Actor> allActors) {

    public Map<Integer, Long> getBlockbusterCountByYear() {
        return movies().stream()
            .filter(movie -> {
                if(movie.boxOfficeByRegion() == null || movie.boxOfficeByRegion().isEmpty()){
                    return false;
                }

                double globalBoxOffice = movie.boxOfficeByRegion().values().stream()
                                              .mapToDouble(Double::doubleValue)
                                              .sum();

                return globalBoxOffice >= 500.0 && movie.rating() >= 8.0;
            })
            .collect(Collectors.groupingBy(
                Movie::year,
                Collectors.counting()
            ));
    }

    public Optional<Actor> getActorWithMostDiverseGenres() {
        return allActors().stream()
            .filter(actor -> !actor.genres().isEmpty())
            .max(Comparator.comparingLong(actor -> 
                actor.genres().stream()
                    .distinct()
                    .count()
            ));
    }

    public OptionalDouble getAverageBoxOfficeForActorGenre(String targetGenre) {
        return movies().stream()
            .filter(movie -> {
                if(movie.boxOfficeByRegion() == null || movie.boxOfficeByRegion().isEmpty()) {
                    return false;
                }

                if (movie.cast() == null || movie.cast().isEmpty()) {
                    return false;
                }

                return movie.cast().stream()
                    .anyMatch(actor -> actor.genres() != null && actor.genres().contains(targetGenre));
            })
            .mapToDouble(movie -> 
                movie.boxOfficeByRegion().values().stream()
                    .mapToDouble(Double::doubleValue)
                    .sum()
            )
            .average();
    }

    public List<String> getMoviesWithoutRiskyActors(List<String> riskyActors) {
        Set<String> riskyActorsLowerCaseSet = riskyActors.stream()
            .map((String s) -> s.toLowerCase())
            .collect(Collectors.toSet());

        return movies().stream()
            .filter(movie -> {
                if(movie.cast() == null || movie.cast().isEmpty()) {
                    return false;
                }
                return movie.cast().stream()
                    .noneMatch(actor ->
                        actor.name() != null &&
                        riskyActorsLowerCaseSet.contains(actor.name().toLowerCase())
                    );
            })
            .map(movie -> movie.title().toLowerCase())
            .distinct()
            .toList();
    }

}