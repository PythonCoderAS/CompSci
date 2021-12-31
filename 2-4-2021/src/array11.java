public int array11(int[] nums, int index) {
  int val = 0;
  if (index >= nums.length){
    return 0;
  }
  if (nums[index] == 11){
    val++;
  }
  return val + array11(nums, index+1);
}
