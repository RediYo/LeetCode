class Interview45 {

  public String minNumber(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = 0; j < nums.length - i - 1; j++) {
        if (
          Integer.parseInt(nums[j] + nums[j + 1] + "") <
          Integer.parseInt(nums[j + 1] + nums[j] + "")
        ) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    return null;
  }
}
