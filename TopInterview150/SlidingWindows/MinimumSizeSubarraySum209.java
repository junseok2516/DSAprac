package SlidingWindows;

public class MinimumSizeSubarraySum209 {
    // brute force
//    static int minSubArrayLen(int target, int[] nums) {
//        int sum = 0; int min = Integer.MAX_VALUE;
//        for (int i = 0; i < nums.length-1; i++) {
//            sum += nums[i];
//            for (int j = i; j < nums.length - 1; j++) {
//                if (sum < target) {
//                    sum += nums[++j];
//                }
//                if (sum == target) {
//                    min = Math.min(min, j - i + 1);
//                }
//            }
//            sum = 0;
//        }
//        return min == Integer.MAX_VALUE ? 0 : min;
//    }

//    static int minSubArrayLen(int target, int[] nums) {
//        int l=0,sum=0,min=Integer.MAX_VALUE;
//        for (int r = 0; r < nums.length; r++) {
//            sum += nums[r];
//            while (sum >= target) {
//                min = Math.min(min, r - l + 1);
//                sum -= nums[l];
//                l++;
//            }
//        }
//        return min == Integer.MAX_VALUE ? 0 : min;
//    }

    static int minSubArrayLen(int target, int[] nums) {
        // was confused of running pointer matching the target
        // it mentions "sum is greater than or equal to target"
        // read carefully the problem!!
        int minLen = Integer.MAX_VALUE, p2 = 0, sum = 0;
        for (int p1 = 0; p1 < nums.length; p1++) {
            sum += nums[p1];
            while (sum >= target) {
                minLen = Math.min(minLen, p1 - p2 + 1);
                sum -= nums[p2];
                p2++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;
    }


    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}
