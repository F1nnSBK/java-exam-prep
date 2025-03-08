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
        return fee > 0;
    }

    public void rent(Person person)
        throws NotRentableException, TooLowBudgetException {
        if (!isRentable() || !isFree()) {
            throw new NotRentableException();
        } else if (fee > person.budget) {
            throw new TooLowBudgetException();
        } else {
            this.renter = person;
        }
    }
}
