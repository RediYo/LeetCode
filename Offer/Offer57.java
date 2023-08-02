public class Offer57 {
    public int[] twoSum(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left < right) {

            if (nums[right] + nums[left] == target) {
                return new int[] { nums[right], nums[left] };
            } else if (nums[right] + nums[left] > target) {
                right--;
            } else {
                left++;
            }

        }
        return null;
    }
}