public int count7(int n) {
  int val = 0;
  if (n % 10 == 7){
    val++;
  }
  if (n > 10){
    return val + count7(n/10);
  }
  return val;
}
