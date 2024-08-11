public class HouseRobber198 {
    static int rob(int[] nums) {
        // DP Top-down
//        int[] dp = new int[nums.length + 1];
//        dp[0] = 0; // no visited house yet
//        dp[1] = nums[0]; // since nums.length == 1 guaranteed
//        for (int i = 1; i < nums.length; i++) {
//            dp[i+1] = Math.max(dp[i], dp[i-1]+nums[i]);
//        }
//        return dp[nums.length];

        // DP Bottom-up
        int[] dp = {0, nums[0]};
        for (int i = 1; i < nums.length; i++) {
            int tmp = dp[1];
            dp[1] = Math.max(dp[1], dp[0] + nums[i]);
            dp[0] = tmp;
        }
        return dp[1];
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
}
