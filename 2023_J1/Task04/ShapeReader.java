public class ShapeReader {
    private final ArrayList<Shape> shapes;

    public ShapeReader(String[] elements) {
        this.shapes = new ArrayList<>();
        for (String element : elements) {
            String[] elementParts = element.split(";"),
            if (element.equals("Circle")) {
                shapes.add(new Circle())
            }
        }
    }
}
