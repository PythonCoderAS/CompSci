public double getSlope(){
    if (p2.x==p1.x){
        throw new IllegalStateException();
    }
    return (double) (p2.y-p1.y)/(p2.x-p1.x);
}