public class CardsDealer {

    private final List<Card> deck;
    private final Player player1;
    private final Player player2;

    public CardsDealer(List<Card> deck, Player player1, Player player2) {
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void dealCards(int amount) {
        if (amount > deck.size()) {
            amount = deck.size();
        }

        Collections.shuffle(deck);

        for (int i = 0; i < amount; i++) {
            if (i % 2 == 0) {
                player1.addCard(deck.remove(0));
            } else {
                player2.addCard(deck.remove(0));
            }
        }
    }
}
