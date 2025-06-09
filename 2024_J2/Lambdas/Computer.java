package Lambdas;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public record Computer(int cpuCores, double GhzPerCore, int ram) {
     public static Predicate<Computer> canItRunCrysis = c -> c.cpuCores() > 4 && c.ram() > 16;
     public static Function<Computer, Computer> doubleRam = c -> new Computer(c.cpuCores(), c.GhzPerCore(), c.ram() * 2); 

     public static Predicate<Computer> hasMinimumGhzSum(int ghzSum) {
        return c -> c.cpuCores() * c.GhzPerCore() >= ghzSum;
     }

     public static Stream<Computer> getComputers() {
        return Stream.of(new Computer(6, 3.8, 32));
     }
} 
