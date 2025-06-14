package lambdas_03;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
