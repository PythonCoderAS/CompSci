public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] result = new String[n];
  int aIndex = 0, bIndex = 0, currentIndex = 0;
  while (currentIndex < n){
    for (String item: result){
      if (item != null && item.equals(a[aIndex])){
        aIndex++;
      }
      if (item != null && item.equals(b[bIndex])){
        bIndex++;
      }
    }
    if (a[aIndex].compareTo(b[bIndex]) < 0){ // a[i] < b[i]
      result[currentIndex] = a[aIndex];
      aIndex++;
    } else {
      result[currentIndex] = b[bIndex];
      bIndex++;
    }
    currentIndex++;
  }
  return result;
}
