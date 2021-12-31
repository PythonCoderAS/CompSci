double averageLength(String[] arr){
    int sum = 0;
    for (int i=0; i < arr.length; i++){
        sum += arr[i].length();
    }
    return (double) sum / arr.length;
}