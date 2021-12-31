String[] swapPairs(String[] arr){
    int length;
    String left, right;
    if (arr.length % 2 == 1){
        length = arr.length - 1;
    } else {
        length = arr.length;
    }
    for (int i=0; i < length - 1; i+=2){
        left = arr[i];
        right = arr[i+1];
        arr[i] = right;
        arr[i+1] = left;
    }
    return arr;
}