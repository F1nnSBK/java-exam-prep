import java.util.ArrayList;
import java.util.List;

public class CashierSystem {

    private List<Goods> goodsList;
    private List<Cashier> cashiers;
    private Cashier loggedInCashier;
    private ShoppingCart shoppingCart;

    public CashierSystem() {
        this.goodsList = new ArrayList<>();
        this.cashiers = new ArrayList<>();
        this.loggedInCashier = null;
        this.shoppingCart = null;
    }

    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public void addCashier(Cashier cashier) {
        cashiers.add(cashier);
    }

    public void login(int id) {
        for (Cashier cashier : cashiers) {
            if (cashier.getId() == id) {
                loggedInCashier = cashier;
                System.out.println(
                    "Kassierer " + loggedInCashier.getName() + " angemeldet."
                );
                return;
            }
        }
        System.out.println("Kassierer mit ID " + id + " nicht gefunden.");
    }

    public void createShoppingCart() {
        if (loggedInCashier != null) {
            shoppingCart = new ShoppingCart();
            System.out.println("Neuer Warenkorb erstellt.");
        } else {
            System.out.println("Bitte melden Sie sich zuerst an.");
        }
    }

    public void addItem(int goodsId, int amount) {
        if (shoppingCart != null && loggedInCashier != null) {
            Goods goodsToAdd = null;
            for (Goods goods : goodsList) {
                if (goods.getId() == goodsId) {
                    goodsToAdd = goods;
                    break;
                }
            }
            if (goodsToAdd != null) {
                Item item = new Item(goodsToAdd, amount);
                shoppingCart.addItem(item);
                System.out.println(
                    amount +
                    "x " +
                    goodsToAdd.getDescription() +
                    " zum Warenkorb hinzugefügt."
                );
            } else {
                System.out.println(
                    "Produkt mit ID " + goodsId + " nicht gefunden."
                );
            }
        } else {
            System.out.println(
                "Bitte erstellen Sie zuerst einen Warenkorb und melden Sie sich an."
            );
        }
    }

    public void printBon() {
        if (shoppingCart != null && loggedInCashier != null) {
            System.out.println("--- Bon ---");
            System.out.println("Kassierer: " + loggedInCashier.getName());
            System.out.println("Produkte:");
            for (Item item : shoppingCart.getItems()) {
                System.out.println(
                    item.getAmount() +
                    "x " +
                    item.getGoods().getDescription() +
                    " - " +
                    item.getSubTotalInEuro() +
                    " Euro"
                );
            }
            System.out.println(
                "Gesamt: " + shoppingCart.getTotalAmount() + " Euro"
            );
            System.out.println("---");
        } else {
            System.out.println(
                "Bitte erstellen Sie zuerst einen Warenkorb und melden Sie sich an."
            );
        }
    }
}
