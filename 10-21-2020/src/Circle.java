public class Circle {
    private double r;

    public Circle(double radius) {
        r = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
