int max(int[] arr){
    int maxVal = arr[0];
    for (int i=1; i < arr.length; i++){
        if (arr[i] > maxVal){
            maxVal = arr[i];
        }
    }
    return maxVal;
}