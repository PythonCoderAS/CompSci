import java.util.Scanner;

public class CylinderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume of the cylinder: " + cylinder.getVolume());
    }
}
