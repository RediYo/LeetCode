public class Offer560 {
    public int subarraySum(int[] nums, int k) {

        // 1.循环遍历每个元素
        // 2.以遍历元素为起点统计子连续数组和是否为k的个数
        int sum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }

        }
        return count;
    }
}
