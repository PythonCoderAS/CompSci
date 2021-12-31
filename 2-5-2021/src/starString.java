public String starString(int n) {
	if (n == 0){
        return "*";
    } else if (n < 0){
        throw new IllegalArgumentException();
    } else {
        return starString(n-1) + starString(n-1);
    }
}