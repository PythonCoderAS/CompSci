public class Point3D extends Point implements Comparable<Point3D> {
    private int z;

    public Point3D() {
        super();
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        z = 0;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }

    public double distanceFromOrigin() {
        return distance(new Point3D());
    }

    public double distance(Point3D p) {
        int dx = x - p.x;
        int dy = y - p.y;
        int dz = z - p.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    /**
     * Compares this object with the specified object for order.  Returns a
     * negative integer, zero, or a positive integer as this object is less
     * than, equal to, or greater than the specified object.
     *
     * @param o the object to be compared.
     * @return a negative integer, zero, or a positive integer as this object
     * is less than, equal to, or greater than the specified object.
     * @throws NullPointerException if the specified object is null
     * @throws ClassCastException   if the specified object's type prevents it
     *                              from being compared to this object.
     */
    public int compareTo(Point3D o) {
        if (o.getX() == x) {
            if (o.getY() == y) {
                return z - o.getZ();
            } else {
                return y - o.getY();
            }
        } else {
            return x - o.getX();
        }
    }
}