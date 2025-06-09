package Optional;
public class Task01 {
    public static void main(String[] args) {
        Car bmw = new Car("BMW", "320i");
        Car mercedes = new Car("Mercedes", "G63", "AMG");

        bmw.print();
        mercedes.print();
    }
}
