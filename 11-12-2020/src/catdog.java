public boolean catDog(String str) {
  int cat = 0;
  int dog = 0;
  if (str.indexOf("cat") < 0 && str.indexOf("dog") < 0){
    return true;
  } else if (str.indexOf("cat") < 0 || str.indexOf("dog") < 0){
    return false;
  }
  for (int i = 0; i < str.length(); i++){
    if (i >= (str.length() - 2)){
      // do nothing, how do I do that?
      int doNothing;
    } else {
      if (str.substring(i, i+3).equals("cat")){
        cat++;
      } else if (str.substring(i, i+3).equals("dog")){
        dog++;
      }
    }
  }
  return cat == dog;
}
