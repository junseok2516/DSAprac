import java.util.*;

public class LongestConsecutiveSequence128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;
        Arrays.sort(nums);
        nums = Arrays.stream(nums).distinct().toArray();
        int max = 1; int cnt = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == 1) {
                cnt++;
                max = Math.max(cnt, max);
            } else {
                cnt = 1;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0};
        System.out.println(longestConsecutive(nums));
    }
}
