package Lambdas;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public record Game(String name, Usk usk, double price) {
    public static Predicate<Game> isForChildren = g -> Usk.getChildUsks().contains(g.usk);
    public static Function<Game, Game> makeRemaster = g -> new Game(g.name + " Remastered", g.usk, g.price * 1.5);

    public static Predicate<Game> isCheaperThan(double price) {
        return g -> g.price < price;
    }

    public static Stream<Game> getGames() {
        return Stream.of(new Game("Rainbow 6", Usk.EIGHTEEN, 19.99));
    }
}
