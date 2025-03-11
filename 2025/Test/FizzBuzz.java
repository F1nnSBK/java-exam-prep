public class FizzBuzz {

    public static void main(String[] args) {
        int arraySize = 100;
        fizzBuzz(arraySize + 1);
    }

    public static void fizzBuzz(int arraySize) {
        for (int i = 1; i < arraySize; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
