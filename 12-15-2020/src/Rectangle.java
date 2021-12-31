public class Rectangle  extends Shape{
    private double length, width;

    public Rectangle(double l, double w){
        length = l;
        width = w;
    }

    public double getArea() {
        return length * width;
    }
}
