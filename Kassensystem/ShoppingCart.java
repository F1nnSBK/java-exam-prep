import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        this.items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Item item : items) {
            total += item.getSubTotalInEuro();
        }
        return total;
    }
}
