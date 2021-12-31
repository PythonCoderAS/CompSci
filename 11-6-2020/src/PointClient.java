public class PointClient {
    public static void main(String[] args) {

        // construct two Point objects, one at (8, 2) and one at (4, 3)
        Point p1 = new Point(8, 2);
        Point p2 = new Point(4, 3);

        // display the two Point objects' state
        System.out.println("p1 is " + p1.toString());
        System.out.println("p2 is " + p2.toString());

        // display p1 distance from origin
        System.out.println("p1's distance from origin is " + p1.distanceFromOrigin());

        // translate p1 to (9, 4)
        // translate p2 to (3, 13)

        p1.setLocation(9, 4);
        p2.setLocation(3, 13);

        // display the two Point objects' state again
        System.out.println("p1 is now " + p1.toString());
        System.out.println("p2 is now " + p2.toString());
    }
}
