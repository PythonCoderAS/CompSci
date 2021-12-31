import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();
        double squareRoot = getSquareRootDiscriminant(a, b, c);
        double x1 = finalizeQuadratic(a, b, squareRoot);
        double x2 = finalizeQuadratic(a, b, -squareRoot);
        System.out.println("Root 1: " + x1);
        System.out.println("Root 2: " + x2);
    }

    public static double getSquareRootDiscriminant(int a, int b, int c) {
        return Math.sqrt(Math.pow(b, 2) - (4 * a * c));
    }

    public static double finalizeQuadratic(int a, int b, double squareRoot) {
        return (-b + squareRoot) / (2 * a);
    }

}
