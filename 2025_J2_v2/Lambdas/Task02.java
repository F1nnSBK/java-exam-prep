package Lambdas;

public class Task02 {
    public static void main(String[] args) {
        Game.getGames()
            .map(Game.makeRemaster)
            .filter(Game.isForChildren)
            .filter(Game.isCheaperThan(70))
            .forEach(System.out::println);
    }
}
