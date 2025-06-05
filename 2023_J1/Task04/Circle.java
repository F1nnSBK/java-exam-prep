
public class Circle extends Shape {
    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2)
    }

    public double getCircumference() {
        return 2 * (Math.PI * r);
    }

    public String toString() {
        return "Circle [r=[" + this.r + "]]";
    }
}
