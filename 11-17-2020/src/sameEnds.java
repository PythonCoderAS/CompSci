public String sameEnds(String string) {
  int length=0;
  String substring;
  while (true){
    length++;
    if (length * 2 > string.length()){
      break;
    } else {
      if (string.substring(0, length).equals(string.substring(string.length() - length, string.length()))){
        substring = string.substring(0, length);
      } else {
        break;
      }
    }
  }
  return substring;
}
