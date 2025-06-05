public class Player implements Comparable<Card> {

    private final List<Card> cards;

    public Player() {
        this.card = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public Card getCardWithHighestValue() {
        Card highestCard = cards.get(0);
        for (Card card : this.cards) {
            if (highestCard.getValue() < card.getValue()) {
                highestCard = card;
            }
        }
        return highestCard;
    }

    public List<Card> getCardsByColour(String colour) {
        List<Card> colouredCards = new ArrayList<>();
        for (Card card : this.cards) {
            if (card.getColour() == colour) {
                colouredCards.add(card);
            }
        }
        return colouredCards;
    }
}
