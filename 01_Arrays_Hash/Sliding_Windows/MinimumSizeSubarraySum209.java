package Sliding_Windows;

public class MinimumSizeSubarraySum209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                len = Math.min(len, r-l+1);
                sum -= nums[l];
                l += 1;
            }
        }
        return Math.max(len, 0) == Integer.MAX_VALUE ? 0 : len;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        System.out.println(minSubArrayLen(11, arr));
    }
}
