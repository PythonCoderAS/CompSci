public class Line {
	private Point point1, point2;
    public Line(Point p1, Point p2){
        point1=p1;
        point2=p2;
    }
    
    public Point getP1(){
        return point1;
    }
    
    public Point getP2(){
        return point2;
    }
    
    public String toString(){
        return "[(" + point1.x + ", " + point1.y + "), (" + point2.x + ", " + point2.y + ")]";
    }
}