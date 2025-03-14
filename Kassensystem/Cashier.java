public class Cashier {

    private final int id;
    private final String name;

    public Cashier(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}
