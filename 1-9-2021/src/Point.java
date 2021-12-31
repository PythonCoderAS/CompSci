public class Point implements Place{
    private double x, y;

    public Point(double xCoord, double yCoord){
        x = xCoord;
        y = yCoord;
    }

    public double distance(Place other) {
        Point otherPoint = (Point) other;
        return Math.sqrt(Math.pow(otherPoint.x - x, 2) + Math.pow(otherPoint.y - y, 2));
    }

    public String toString() {
        return "("+x+", "+y+")";
    }
}
