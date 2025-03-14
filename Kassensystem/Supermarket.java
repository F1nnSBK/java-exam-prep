public class Supermarket {

    public static void main(String[] args) {
        CashierSystem cashierSystem = new CashierSystem();

        // Kassierer erstellen und hinzufügen
        Cashier cashier1 = new Cashier(1, "Max Mustermann");
        Cashier cashier2 = new Cashier(2, "Erika Musterfrau");
        cashierSystem.addCashier(cashier1);
        cashierSystem.addCashier(cashier2);

        // Produkte erstellen und hinzufügen
        Goods brot = new Goods(
            101,
            "Brot",
            "Stück",
            2.50,
            ClassOfGoods.BAKERY_PRODUCTS
        );
        Goods milch = new Goods(
            201,
            "Milch",
            "Liter",
            1.20,
            ClassOfGoods.DAIRY_PRODUCTS
        );
        Goods apfel = new Goods(
            301,
            "Apfel",
            "Stück",
            0.50,
            ClassOfGoods.FRUITS
        );
        cashierSystem.addGoods(brot);
        cashierSystem.addGoods(milch);
        cashierSystem.addGoods(apfel);

        // Kassierer 1 meldet sich an
        cashierSystem.login(1);

        // Warenkorb erstellen
        cashierSystem.createShoppingCart();

        // Produkte zum Warenkorb hinzufügen
        cashierSystem.addItem(101, 2); // 2x Brot
        cashierSystem.addItem(201, 1); // 1x Milch
        cashierSystem.addItem(301, 5); // 5x Apfel

        // Bon ausdrucken
        cashierSystem.printBon();

        // Kassierer 2 meldet sich an
        cashierSystem.login(2);

        // Warenkorb erstellen
        cashierSystem.createShoppingCart();

        // Produkte zum Warenkorb hinzufügen
        cashierSystem.addItem(201, 3); // 3x Milch
        cashierSystem.addItem(301, 2); // 2x Apfel

        // Bon ausdrucken
        cashierSystem.printBon();
    }
}
