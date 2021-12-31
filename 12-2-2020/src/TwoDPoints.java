import java.util.Arrays;

public class TwoDPoints {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3},
                {-1, -1, -1},
                {3.5, 2, -1},
                {-1.5, 4, 2},
                {5.5, 4, -0.5}};
        double smallestDistance = -1, distance = 0;
        double[] smallestPoint1 = new double[3], smallestPoint2 = new double[3];
        for (double[] point1 : points) {
            for (double[] point2 : points) {
                distance = getDistance(point1, point2);
                if ((distance < smallestDistance || smallestDistance == -1) && !Arrays.equals(point1, point2)) {
                    smallestDistance = distance;
                    smallestPoint1 = point1;
                    smallestPoint2 = point2;
                }
            }
        }
        System.out.println("Smallest distance: " + smallestDistance + " between points " +
                Arrays.toString(smallestPoint1) + " and " + Arrays.toString(smallestPoint2) + ".");
    }

    public static double getDistance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2) +
                Math.pow(point1[2] - point2[2], 2));
    }
}
