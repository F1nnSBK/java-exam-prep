package Lambdas;

public class Task2 {
    public static void main(String[] args) {
        Data.getAnimals()
            .filter(Helper.isHigherThan(50))
            .map(Helper.toOutput)
            .forEach(System.out::println);
    }
}
