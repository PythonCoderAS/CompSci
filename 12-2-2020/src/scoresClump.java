public boolean scoresClump(int[] scores) {
    for (int i=0; i < scores.length - 2; i++){
    if (Math.abs(scores[i] - scores[i+1]) <= 2 && Math.abs(scores[i] - scores[i+2]) <= 2 && Math.abs(scores[i+1] - scores[i+2]) <= 2){
      return true;
    }
  }
  return false;
}
