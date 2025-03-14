public class Item {

    private final Goods goods;
    private int amount;

    public Item(Goods goods, int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.goods = goods;
        this.amount = amount;
    }

    public Goods getGoods() {
        return goods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
        this.amount = amount;
    }

    public double getSubTotalInEuro() {
        return goods.getPriceInEuro() * amount;
    }
}
