public abstract class Triangle {
    private double side;

    public Triangle(double s){
        side = s;
    }

    public double getSide() {
        return side;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

}
