public class Offer53_1 {

  public int search(int[] nums, int target) {
    int occurNums = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        occurNums++;
      }
    }
    return occurNums;
  }
}
