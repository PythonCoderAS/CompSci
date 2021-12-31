public boolean isCollinear(Point p){
    return ((double) (p2.y-p1.y) / (p2.x-p1.x)) == ((double) (p.y-p1.y) / (p.x-p1.x));
}