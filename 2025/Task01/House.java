import java.util.ArrayList;

public class House implements Rentable, Comparable<House> {

    private final int number;
    public final double fee;
    private Person renter;
    public final ArrayList<Flat> flats;

    public House(int number, int numberOfFlats) {
        this(number, numberOfFlats, 0);
    }

    public House(int number, int numberOfFlats, double fee) {
        this.number = number;
        this.fee = fee;
        this.renter = null;
        this.flats = new ArrayList<>();

        int flatFee = 500;
        for (int i = 0; i < numberOfFlats; i++) {
            this.flats.add(new Flat(flatFee));
            flatFee += 100;
        }
    }

    public int getNumber() {
        return number;
    }

    public boolean isRentable() {
        return this.fee > 0 && renter == null;
    }

    public void rent(Person person)
        throws NotRentableException, TooLowBudgetException {
        if (!isRentable()) {
            throw new NotRentableException();
        } else if (this.fee > person.budget) {
            throw new TooLowBudgetException(this.fee - person.budget);
        } else {
            this.renter = person;
        }
    }

    public int compareTo(House other) {
        if (this.number > other.number) {
            return 1;
        } else {
            return -1;
        }
    }
}
