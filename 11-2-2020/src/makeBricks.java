public boolean makeBricks(int small, int big, int goal) {
  if ((small + 5 * big) == goal){
    return true;
  }
  int five_needed = goal / 5;
  if (five_needed <= big){
    int remainder = goal - (five_needed * 5);
    if (small >= remainder){
      return true;
    }
    else{
      return false;
    }
  }
  else{
    int remainder = goal - (big * 5);
    if (small >= remainder){
      return true;
    }
    else{
      return false;
    }
  }
}
