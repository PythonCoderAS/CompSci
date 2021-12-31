public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(5.0, 4.0);   //you will need to write Rectangle
        Shape s3 = new Square(4.5);  //you will need to write Square
        Shape larger = getLargerShape(s1, s2, s3);

        System.out.println("The area of the larger shape is: " + larger.getArea());
    }

    public static Shape getLargerShape(Shape s1, Shape s2, Shape s3) {
        double a1 = s1.getArea(), a2 = s2.getArea(), a3 = s3.getArea();
        if (a1 > a2) {
            if (a1 > a3) {
                return s1;
            } else {
                return s3;
            }
        } else {
            if (a2 > a3) {
                return s2;
            } else {
                return s3;
            }
        }
    }
}
