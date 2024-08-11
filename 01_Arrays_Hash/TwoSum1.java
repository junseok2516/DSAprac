import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> newNums = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (newNums.containsKey(remain)) {
                System.out.println(Arrays.toString(new int[]{newNums.get(remain), i}));
                return new int[]{newNums.get(remain), i};
            }
            newNums.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {3,2,4};
        twoSum(nums, 6);
    }
}
