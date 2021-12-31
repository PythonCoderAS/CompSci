import java.awt.*;

// A Point object represents a pair of (x, y) coordinates.
public class Point {
    public int x;
    public int y;

    // Constructs a new point at the origin, (0, 0).
    public Point() {
        this(0, 0);  // calls Point(int, int) constructor
    }

    // Constructs a new point with the given (x, y) location.
    public Point(Point p) {
        setLocation(p.x, p.y);
    }

    // Constructs a new point with the given (x, y) location.
    // pre: x >= 0 && y >= 0
    public Point(int x, int y) {
        setLocation(x, y);
    }

    // Returns the distance between this Point and (0, 0).
    public double distanceFromOrigin() {
        return distance(new Point());
    }

    // Returns the distance between this Point and the given other Point.
    public double distance(Point p) {
        int dx = x - p.x;
        int dy = y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Draws a point on a DrawingPanel.
    public final void draw(Graphics g) {
        g.fillOval(x, y, 3, 3);
        g.drawString(toString(), x, y);
    }

    // Returns whether o refers to a point with the same (x, y)
    // coordinates as this point.
    public final boolean equals(Object o) {
        if (o instanceof Point) {
            Point other = (Point) o;
            return x == other.x && y == other.y;
        } else { // not a Point object
            return false;
        }
    }

    // Returns the x-coordinate of this point.
    public final int getX() {
        return x;
    }

    // Sets the x-coordinate of this point to the given value.
    public void setX(int x) {
        this.x = x;
    }

    // Returns the y-coordinate of this point.
    public final int getY() {
        return y;
    }

    // Sets the y-coordinate of this point to the given value.
    public void setY(int y) {
        this.y = y;
    }

    // Sets this point's (x, y) location to the given values.
    // pre: x >= 0 && y >= 0
    public void setLocation(int x, int y) {
        // if (x < 0 || y < 0) {
        //     throw new IllegalArgumentException();
        // }

        this.x = x;
        this.y = y;
    }

    // Returns a String representation of this point.
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Shifts this point's location by the given amount.
    // pre: x + dx >= 0 && y + dy >= 0
    public void translate(int dx, int dy) {
        setLocation(x + dx, y + dy);
    }

// YOUR CODE GOES HERE

}