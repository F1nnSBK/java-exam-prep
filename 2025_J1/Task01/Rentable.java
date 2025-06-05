public interface Rentable {
    public void rent(Person person)
        throws NotRentableException, TooLowBudgetException;
}
