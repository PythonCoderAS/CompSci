public class Square extends Shape{
    private double side;

    public Square(double s){
        side = s;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }
}
