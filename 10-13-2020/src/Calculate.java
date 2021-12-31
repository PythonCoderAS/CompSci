import java.util.Scanner;
import java.lang.Math;

/*
Use the given program as a reference, write a Java program. Prompt the user to enter two numbers, and your program
prints out the 1) SUM, 2) DIFFERENCE, 3) PRODUCT, 4) QUOTIENT, 5) SQUARE, 6) SQUARE ROOT of the two numbers.
*/

public class Calculate {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        System.out.print("Enter int x: ");
        int x = sk.nextInt();
        System.out.print("Enter int y: ");
        int y = sk.nextInt();

        System.out.println("x + y = " + getSum(x, y));
        System.out.println("x - y = " + getDifference(x, y));
        System.out.println("x * y = " + getProduct(x, y));
        System.out.println("x / y = " + getQuotient(x, y));
        System.out.println("x^2 = " + getSquare(x));
        System.out.println("y^2 = " + getSquare(y));
        System.out.println("√x = " + getSquareRoot(x));
        System.out.println("√y = " + getSquareRoot(y));
    }

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static int getDifference(int x, int y) {
        return x - y;
    }

    public static int getProduct(int x, int y) {
        return x * y;
    }

    public static double getQuotient(double x, double y) {
        return x / y;
    }

    public static int getSquare(int x) {
        return x * x;
    }

    public static double getSquareRoot(int x) {
        return Math.sqrt(x);
    }

}
