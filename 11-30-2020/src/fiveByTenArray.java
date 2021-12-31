int[][] table = new int[5][10];
for (int i=0; i < table.length; i++){
    for (int j=0; j < table[i].length; j++){
        table[i][j] = i * j;
    }
}