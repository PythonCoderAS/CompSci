public String minCat(String a, String b) {
  int difference = a.length() - b.length();
  if (difference == 0){
    return a + b;
  }
  else if (difference < 0){ // b is bigger
    return a + b.substring(b.length() - a.length());
  }
  else {
    return a.substring(a.length() - b.length()) + b;
  }
}
