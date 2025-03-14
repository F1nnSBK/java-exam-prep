import java.util.ArrayList;

public class GiftBag {

    private final ArrayList<Present> presents;

    public GiftBag() {
        this.presents = new ArrayList<>();
    }

    public void addPresent(Present present) {
        this.presents.add(present);
    }

    public Present getMostExpensivePresent() {
        Present mostExpensivePresent = this.presents.get(0);
        for (Present present : this.presents) {
            if (mostExpensivePresent.getPrice() < present.getPrice()) {
                mostExpensivePresent = present;
            }
        }
        return mostExpensivePresent;
    }
}
