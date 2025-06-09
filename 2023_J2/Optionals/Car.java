package Optionals;
import java.util.Optional;

public class Car{
    public String name;
    public String brand;
    public Optional<String> addition;

    public Car(String name, String brand) {
        this(name, brand, null);
    }

    public Car(String name, String brand, String addition) {
        this.name = name;
        this.brand = brand;
        this.addition = Optional.ofNullable(addition);
    }

    @Override
    public String toString() {
        return this.brand + " " + this.name + addition.map(s -> " " + s).orElse("");
    }

    // @Override
    // public String toString() {
    //     return this.brand + " " + this.name + (addition.isPresent() ? addition.get() : "");
    // }
}
