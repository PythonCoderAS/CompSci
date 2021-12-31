public class EquilateralTriangle extends Triangle{
    public EquilateralTriangle(double side){
        super(side);
    }

    public double getArea() {
        return (Math.sqrt(3)/4) * Math.pow(getSide(), 2);
    }

    public double getPerimeter() {
        return 3 * getSide();
    }
}
