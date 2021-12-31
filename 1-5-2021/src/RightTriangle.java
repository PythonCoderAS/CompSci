public class RightTriangle extends Triangle{
    private double height;

    /**
     * The side field in the parent abstract class (Triangle) is the base of a right triangle. For this reason, the
     * other defined field is height.
     * @param side1 The base.
     * @param side2 The height.
     */
    public RightTriangle(double side1, double side2){
        super(side1);
        height = side2;
    }

    public double getArea() {
        return getSide() * height;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(getSide(), 2) + Math.pow(height, 2));
    }

    public double getPerimeter() {
        return getSide() + height + getHypotenuse();
    }
}
