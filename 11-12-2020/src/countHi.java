public int countHi(String str) {
  int count = 0;
  if (str.indexOf("hi") < 0){
    return 0;
  }
  for (int i = 0; i < str.length(); i++){
    if (i == (str.length() - 1)){
      // do nothing, how do I do that?
      int doNothing;
    } else {
      if (str.substring(i, i+2).equals("hi")){
        count++;
      }
    }
  }
  return count;
}