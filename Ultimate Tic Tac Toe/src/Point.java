public class Point {
    private final int x;
    private final int y;

    public Point(int xLoc, int yLoc){
        x = xLoc;
        y = yLoc;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
