public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {
        int curSum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            max = Math.max(curSum, max);
            curSum = Math.max(curSum, 0);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(maxSubArray(arr));
    }
}
