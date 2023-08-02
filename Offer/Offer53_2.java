public class Offer53_2 {

  public int missingNumber(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] != i) {
        break;
      }
      i++;
    }
    return i;
  }
}
