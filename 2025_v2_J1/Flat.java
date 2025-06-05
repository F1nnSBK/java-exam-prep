public class Flat implements Rentable {

    public final double fee;
    private Person renter;

    public Flat(double fee) {
        this.fee = fee;
        this.renter = null;
    }

    public boolean isFree() {
        return this.renter == null;
    }

    public boolean isRentable() {
        return this.fee > 0;
    }

    public void rent(Person person)
        throws NotRentableException, TooLowBudgetException {
        if (!this.isRentable() && !this.isFree()) {
            throw new NotRentableException();
        } else if (this.fee > person.budget) {
            throw new TooLowBudgetException(this.fee - person.budget);
        } else {
            this.renter = person;
        }
    }
}
