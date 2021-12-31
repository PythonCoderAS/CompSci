public static boolean isMagicSquare(int[][] a) {
    for (int[] row: a){
        if (row.length != a.length){
            return false;
        }
    }
    boolean firstRow = true;
    int firstRowSum = 0;
    for (int i=0; i<a.length; i++){
        int rowSum = 0;
        for (int j=0; j<a[i].length; j++){
            rowSum += a[i][j];
        }
        if (firstRow){
            firstRowSum = rowSum;
            firstRow = false;
        } else {
            if (rowSum != firstRowSum){
                return false;
            }
        }
    }
    boolean firstCol = true;
    int firstColSum = 0;
    for (int j=0; j<a.length; j++){
        int colSum = 0;
        for (int i=0; i<a[j].length; i++){
            colSum += a[i][j];
        }
        if (firstCol){
            firstColSum = colSum;
            firstCol = false;
            if (firstRowSum != firstColSum){
                return false;
            }
        } else {
            if (colSum != firstColSum){
                return false;
            }
        }
    }
    int diagonal1Sum = 0;
    int diagonal2Sum = 0;
    for (int i=0; i<a.length; i++){
        diagonal1Sum += a[i][i];
        diagonal2Sum += a[i][a.length - 1 - i];
    }
    return diagonal1Sum == firstRowSum && diagonal2Sum == firstRowSum;
}