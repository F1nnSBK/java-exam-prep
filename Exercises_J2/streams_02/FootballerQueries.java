package streams_02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record FootballerQueries(List<Footballer> footballers) {
    
    public int getTotalOfAllGoalsByMidfielders() {
        return footballers.stream()
            .filter(f -> f.position().equals(Position.MIDFIELDER))
            .mapToInt(Footballer::numberOfGoals)
            .sum();
    }

    public Optional<String> getNameOfLiverpoolFCFootballerWithMostPlayedGames() {
        return footballers.stream()
            .filter(f -> f.footballClub().name().equals("Liverpool FC"))
            .sorted(Comparator.comparing(Footballer::numberOfGames).reversed())
            .findFirst()
            .map(Footballer::name);
    }

    public List<FootballClub> getAllFootballClubs() {
        return footballers.stream()
            .map(Footballer::footballClub)
            .distinct()
            .toList();
    }

    public boolean isFootballerWithSizeInCmLT170AndNumberOfGoalsBT0() {
        return footballers.stream()
            .anyMatch(f -> (f.sizeInCm() < 170) && (f.numberOfGoals() >= 1));
    }

    public Map<Integer, List<Footballer>> getAllFootballersByBirthyear() {
        return footballers.stream()
            .collect(Collectors.groupingBy(f -> f.birthdate().getYear()));
    }

    public OptionalDouble getAverageNumberOfPointsFromAllBundesligaFootballClubs() {
        return footballers.stream()
            .map(Footballer::footballClub)
            .distinct()
            .filter(f -> (f.positionInAllTimeTable() != -1) && (f.pointsInAllTimeTable() != -1))
            .mapToDouble(FootballClub::pointsInAllTimeTable)
            .average();
    }

}
