import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        System.out.print("Enter the radius: ");
        Scanner sk = new Scanner(System.in);
        double input = sk.nextDouble();
        Circle c = new Circle(input);
        System.out.println("Circle Area = " + c.getArea());
        sk.close();
    }
}
