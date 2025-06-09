package Optional;
import java.util.Optional;

public class Car {

    public String make;
    public String model;
    public Optional<String> additon;

    public Car(String make, String model) {
        this(make, model, null);
    }

    public Car(String make, String model, String addition) {
        this.make = make;
        this.model = model;
        this.additon = Optional.ofNullable(addition);
    }

    public void print() {
        System.out.println(this.make + " " + this.model + " " + (this.additon.isPresent() ? this.additon.get() : ""));
    }
}