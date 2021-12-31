import java.lang.Math;
import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        System.out.println("Surface area of the sphere: " + getArea(radius));
        System.out.println("Volume of the sphere: " + getVolume(radius));
    }

    public static double getArea(double radius) {
        return 4 * Math.PI * (radius * radius);
    }

    public static double getVolume(double radius) {
        return ((double) 4 / 3) * Math.PI * (radius * radius * radius);
    }
}
