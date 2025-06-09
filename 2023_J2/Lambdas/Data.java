package Lambdas;

import java.util.stream.Stream;

public class Data {
    public static Stream<Animal> getAnimals() {
        return Stream.of(new Animal("Peter", "Hicks", 51, 0));
    }
}
