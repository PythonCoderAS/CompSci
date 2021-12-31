public int centeredAverage(int[] nums) {
  int min = nums[0];
  int max= nums[0];
  int minIndex = 0;
  int maxIndex = 0;
  int sum = 0;
  for (int i=1; i < nums.length; i++){
    if (nums[i] < min){
      min = nums[i];
      minIndex = i;
    }
    if (nums[i] > max){
      max = nums[i];
      maxIndex = i;
    } else if (min == max){
      maxIndex = i;
    }
  }
  for (int i=0; i < nums.length; i++){
    if (i != minIndex && i != maxIndex){
      sum += nums[i];
    }
  }
  return sum / (nums.length - 2);
}
