public class Present {

    private final String description;
    private final double price;
    private final Person sender;
    private final Person recipient;

    public Present(
        String description,
        double price,
        Person sender,
        Person recipient
    ) {
        this.description = description;
        this.price = price;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public Person getSender() {
        return this.sender;
    }

    public Person getRecipient() {
        return this.recipient;
    }

    public String toString() {
        return (
            "Present [description=[" +
            this.description +
            "], price=[" +
            this.price +
            "], sender=[" +
            this.sender.getName() +
            "], recipient=[" +
            this.recipient.getName() +
            "]"
        );
    }
}
