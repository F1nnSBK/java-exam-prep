public class Card {

    private final String colour;
    private final int value;

    public Card(String colour, int value) {
        this.colour = colour;
        this.value = value;
    }

    public String getColour() {
        return this.colour;
    }

    public int getValue() {
        return this.value;
    }
}
