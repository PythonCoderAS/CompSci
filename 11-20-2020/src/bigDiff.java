public int bigDiff(int[] nums) {
  int min = nums[0];
  int max= nums[0];
  for (int i=1; i < nums.length; i++){
    if (nums[i] < min){
      min = nums[i];
    }
    if (nums[i] > max){
      max = nums[i];
    }
  }
  return max - min;
}
