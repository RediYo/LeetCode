public class Code53 {

    //53. 最大子数组和
    public int maxSubArray(int[] nums) {

        //动态规划
        //状态 连续数组的最大和
        //状态转移 dp[i] = max{dp[i-1]+nums[i], nums[i]}
        int[] dp =  new int[nums.length];
        dp[0] = nums[0];
        int max=dp[0];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            max = max>dp[i]?max:dp[i];
        }
        return max;
    }
}
