int[][] jagged = new int[5][];
int num = 1;
for (int i=0; i<jagged.length; i++){
    jagged[i] = new int[i+1];
    for (int j=0; j<=i; j++){
        jagged[i][j] = num;
        num++;
    }
}