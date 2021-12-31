public static int[][] matrixAdd(int[][] a, int[][] b) {
    if (a.length == 0){
        return new int[0][0];
    }
	int[][] c = new int[a.length][a[0].length];
    for (int i=0; i < a.length; i++){
        for (int j=0; j < a[i].length; j++){
            c[i][j] = a[i][j] + b[i][j];
        }
    }
    return c;
}