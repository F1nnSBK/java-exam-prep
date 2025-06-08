package streams_02;

import java.time.LocalDate;

public record Footballer(
    String name,
    Position position,
    LocalDate birthdate,
    int sizeInCm,
    FootballClub footballClub,
    int numberOfGames,
    int numberOfGoals
) {
    
}
