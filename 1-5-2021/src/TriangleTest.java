import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of an equilateral triangle: ");
        double eqSide = scanner.nextDouble();
        System.out.print("Enter the base of a right triangle: ");
        double rBase = scanner.nextDouble();
        System.out.print("Enter the height of a right triangle: ");
        double rHeight = scanner.nextDouble();
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(eqSide);
        RightTriangle rightTriangle = new RightTriangle(rBase, rHeight);
        printTriangleProperties(equilateralTriangle, "equilateral");
        printTriangleProperties(rightTriangle, "right");

    }

    public static void printTriangleProperties(Triangle triangle, String triangleName){
        System.out.println("Area of the " + triangleName + " triangle: " + triangle.getArea());
        System.out.println("Perimeter of the " + triangleName + " triangle: " + triangle.getPerimeter());
    }
}
