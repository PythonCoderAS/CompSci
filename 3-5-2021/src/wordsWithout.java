public String[] wordsWithout(String[] words, String target) {
  int elements = words.length;
  for (String word: words){
    if (word.equals(target)){
      elements--;
    }
  }
  String[] result = new String[elements];
  int currentIndex = 0;
  for (String word: words){
    if (!word.equals(target)){
      result[currentIndex] = word;
      currentIndex++;
    }
  }
  return result;
}
