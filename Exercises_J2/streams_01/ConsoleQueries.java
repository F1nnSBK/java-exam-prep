package streams_01;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public record ConsoleQueries(List<Console> consoles) {
    
    public List<String> getAllCurrentConsoleNames() {
        return consoles.stream()
            .filter(c -> c.lifespan() == -1)
            .map(Console::title)
            .toList();
    }

    public List<Console> getAllConsolesSortedByLifespan() {
        return consoles.stream()
            .sorted(Comparator.comparing(Console::lifespan).reversed())
            .toList();
    }

    public boolean isAnyConsoleWithMoreThan150MillionSoldUnits() {
        return consoles.stream()
            .anyMatch(c -> c.soldUnitsInMillions() > 150);
    }

    public boolean isAllConsolesWithMoreThan50MillionSoldUnits() {
        return consoles.stream()
            .allMatch(c -> c.soldUnitsInMillions() > 50);
    }

    public long getNumberOfConsolesFromNintendo() {
        return consoles.stream()
            .filter(c -> c.maker().equals(Maker.NINTENDO))
            .count();
    }

    public List<String> getSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
        return consoles.stream()
            .filter(c -> c.lifespan() != -1)
            .map(c -> {
                double unitsPerYear = c.soldUnitsInMillions() / c.lifespan();
                return c.title() + " (" + unitsPerYear + ")";
            })
            .toList();
    }

    public OptionalDouble getAverageSoldUnitsInMillionsPerYearFromAllOutdatedConsoles() {
        return consoles.stream()
            .filter(c -> c.lifespan() != -1)
            .mapToDouble(c -> c.soldUnitsInMillions() / c.lifespan())
            .average();
    }

    public Map<Maker, List<Console>> getAllConsolesByMaker() {
        return consoles.stream()
            .collect(Collectors.groupingBy(Console::maker));
    }

    public Map<Maker, Double> getTotalSoldUnitsInMillions() {
        return consoles.stream()
            .collect(Collectors.groupingBy(
                Console::maker,
                Collectors.summingDouble(Console::soldUnitsInMillions)
            ));
    }
}
