package Lambdas;

public class Task02 {
    public static void main(String[] args) {
        Computer.getComputers()
            .map(Computer.doubleRam)
            .filter(Computer.canItRunCrysis)
            .filter(Computer.hasMinimumGhzSum(12));
    }
}
