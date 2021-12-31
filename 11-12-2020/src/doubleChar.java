public String doubleChar(String str) {
  String sub;
  String result = "";
  for (int i=0; i<str.length(); i++){
    if (i != (str.length() - 1)){
      sub = str.substring(i, i+1);
    } else {
      sub = str.substring(i);
    }
    result += sub + sub;
  }
  return result;
}
