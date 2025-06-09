package Optionals;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Car benz = new Car("CLA45", "Mercedes", "AMG");
        System.out.println(benz.toString());
        benz.addition = Optional.empty();
        System.out.println(benz.toString());
    }
}