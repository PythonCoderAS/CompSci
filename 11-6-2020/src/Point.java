// A Point object represents a pair of (x, y) coordinates.
// (Point class must be submitted with your solution; do not modify!)
public class Point {
    public int x;
    public int y;

    public Point() {
        setLocation(0, 0);
    }

    public Point(int x, int y) {
        setLocation(x, y);
    }

    public double distanceFromOrigin() {
        return distance(new Point());
    }

    public double distance(Point p) {
        int dx = x - p.x;
        int dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }
}
