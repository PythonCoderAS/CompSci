public boolean closeFar(int a, int b, int c) {
  if (Math.abs(a - b) <= 1){
    return Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2;
  } else if (Math.abs(a - c) <= 1) {
    return Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2;
  } else {
    return false;
  }
}
