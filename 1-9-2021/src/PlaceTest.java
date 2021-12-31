import java.util.Scanner;

public class PlaceTest {
    //returns true if p1 is equidistant from p2 and p3

    public static boolean sameDistance(Place p1, Place p2, Place p3)
    {
        return p1.distance(p2) == p1.distance(p3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate for point 1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for point 1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x-coordinate for point 2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for point 2: ");
        double y2 = scanner.nextDouble();
        System.out.print("Enter the x-coordinate for point 3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for point 3: ");
        double y3 = scanner.nextDouble();
        Point p1 = new Point(x1, y1), p2= new Point(x2, y2), p3 = new Point(x3, y3);
        boolean isEqual = sameDistance(p1, p2, p3);
        String output = "Points " + p1 + ", " + p2 + ", and " + p3 + " are ";
        if (!isEqual){
            output += "not ";
        }
        output += "the same distance apart.";
        System.out.println(output);
    }
}
