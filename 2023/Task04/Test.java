public class Test {

    public static void main(String[] args) {
        String element = "Circle;2";
        String[] element1 = element.split(";");

        for (String i : element1) {
            System.out.println(i);
        }
    }
}
