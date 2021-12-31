public int blackjack(int a, int b) {
  int diffA = 21 - a;
  int diffB = 21 - b;
  if (diffA >= 0 && diffA < diffB){
    return a;
  } else if (diffB >= 0){
    return b;
  } else if (diffA >= 0){
    return a;
  } else {
    return 0;
  }
}
