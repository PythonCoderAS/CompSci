public int fixTeen(int n){
  if (n >= 13 && n <= 19){
    if (n == 15 || n == 16){
      return n;
    }
    else {
      return 0;
    }
  }
  else {
    return n;
  }
}

public int noTeenSum(int a, int b, int c) {
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
}
