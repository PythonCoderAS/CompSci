public String nTwice(String str, int n) {
  String front = str.substring(0, n);
  String back = str.substring(str.length() - n);
  return front + back;
}
