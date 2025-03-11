public class TooLowBudgetException extends Exception {

    public final double missingMoney;

    public TooLowBudgetException(double missingMoney) {
        super();
        this.missingMoney = missingMoney;
    }
}
