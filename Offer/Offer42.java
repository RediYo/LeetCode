import java.util.Arrays;

public class Offer42 {
    
    public int maxSubArray(int[] nums) {

        //int a = nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = dp[i-1]>dp[i-1]+nums[i]?dp[i-1]:dp[i-1]+nums[i];

        }
        return 0;
    }
}
