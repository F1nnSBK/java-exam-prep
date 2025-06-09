package Lambdas;

public class Task02 {
    public static void main(String[] args) {
        Game.getGames()
            .map(Game.makeRemaster)
            .filter(Game.isForChilds)
            .filter(Game.isCheaperThan(70));
    }
}
