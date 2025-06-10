import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataProvider {

    public static List<Actor> getSampleActors() {
        return List.of(
            new Actor("Tom Cruise", LocalDate.of(1962, 7, 3), List.of("Action", "Drama", "Sci-Fi")),
            new Actor("Margot Robbie", LocalDate.of(1990, 7, 2), List.of("Comedy", "Drama", "Action")),
            new Actor("Leonardo DiCaprio", LocalDate.of(1974, 11, 11), List.of("Drama", "Thriller", "Sci-Fi")),
            new Actor("Zendaya", LocalDate.of(1996, 9, 1), List.of("Sci-Fi", "Drama", "Musical")),
            new Actor("Dwayne Johnson", LocalDate.of(1972, 5, 2), List.of("Action", "Comedy")),
            new Actor("Meryl Streep", LocalDate.of(1949, 6, 22), List.of("Drama", "Comedy")),
            new Actor("Timothee Chalamet", LocalDate.of(1995, 12, 27), List.of("Drama", "Sci-Fi")),
            new Actor("Scarlett Johansson", LocalDate.of(1984, 11, 22), List.of("Action", "Sci-Fi", "Drama")),
            new Actor("Chris Evans", LocalDate.of(1981, 6, 13), List.of("Action", "Sci-Fi")),
            // Hinzugefügte Schauspieler, die in getSampleMovies verwendet werden:
            new Actor("Ryan Gosling", LocalDate.of(1980, 11, 12), List.of("Comedy", "Drama")),
            new Actor("Cillian Murphy", LocalDate.of(1976, 5, 25), List.of("Drama", "Thriller")),
            new Actor("Emily Blunt", LocalDate.of(1983, 2, 23), List.of("Drama", "Sci-Fi")),
            new Actor("Sam Neill", LocalDate.of(1947, 9, 14), List.of("Sci-Fi", "Adventure"))
            // Optional: Schauspieler ohne Genres / ältere Schauspieler für zukünftige Tests
            // new Actor("NoGenreActor", LocalDate.of(1980, 1, 1), List.of()),
            // new Actor("OldActor", LocalDate.of(1930, 1, 1), List.of("Drama"))
        );
    }

    public static List<Movie> getSampleMovies(List<Actor> allActors) {
        // Hilfsmethode, um Schauspieler schnell nach Namen zu finden
        Map<String, Actor> actorsByName = allActors.stream()
            .collect(Collectors.toMap(Actor::name, actor -> actor));

        return List.of(
            new Movie("Top Gun: Maverick", 2022, 8.3, 
                List.of(actorsByName.get("Tom Cruise")),
                Map.of("US", 718.7, "Europe", 300.0, "Asia", 100.0)), // Global: 1118.7M
            new Movie("Barbie", 2023, 7.5, 
                List.of(actorsByName.get("Margot Robbie"), actorsByName.get("Ryan Gosling")), // Annahme Ryan Gosling existiert
                Map.of("US", 636.2, "Europe", 400.0)), // Global: 1036.2M
            new Movie("Oppenheimer", 2023, 8.6, 
                List.of(actorsByName.get("Cillian Murphy"), actorsByName.get("Emily Blunt")), // Annahme der Schauspieler existieren
                Map.of("US", 329.8, "Europe", 450.0)), // Global: 779.8M
            new Movie("Inception", 2010, 8.8, 
                List.of(actorsByName.get("Leonardo DiCaprio")),
                Map.of("US", 292.6, "Europe", 200.0)), // Global: 492.6M (Kein Blockbuster < 500M)
            new Movie("Dune: Part Two", 2024, 8.8, 
                List.of(actorsByName.get("Timothee Chalamet"), actorsByName.get("Zendaya")),
                Map.of("US", 282.1, "Asia", 150.0, "Europe", 180.0)), // Global: 612.1M
            new Movie("Mission: Impossible - Dead Reckoning Part One", 2023, 7.8,
                List.of(actorsByName.get("Tom Cruise")),
                Map.of("US", 172.1, "Europe", 300.0)), // Global: 472.1M (Kein Blockbuster < 500M)
            new Movie("Avengers: Endgame", 2019, 8.4,
                List.of(actorsByName.get("Scarlett Johansson"), actorsByName.get("Chris Evans")),
                Map.of("US", 858.4, "Europe", 800.0, "Asia", 1000.0)), // Global: 2658.4M
            new Movie("Jurassic Park", 1993, 8.2, 
                List.of(actorsByName.get("Sam Neill")), // Annahme Schauspieler existiert
                Map.of("US", 400.0, "Europe", 300.0)), // Global: 700.0M
            new Movie("No Box Office Movie", 2020, 7.0, 
                List.of(actorsByName.get("Margot Robbie")),
                Map.of()), // Leere Box Office
            new Movie("No Cast Movie", 2021, 7.2, 
                List.of(), // Leerer Cast
                Map.of("US", 200.0))
        );
    }

    public static MovieAnalytics getSampleData() {
        List<Actor> actors = getSampleActors();
        List<Movie> movies = getSampleMovies(actors);
        return new MovieAnalytics(movies, actors);
    }
}