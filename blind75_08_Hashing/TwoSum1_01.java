import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1_01 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
//        int remain = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(target - nums[i])) {
                return new int[]{i, hash.get(target-nums[i])};
            } else {
                hash.put(nums[i], i);
            }
//            remain = target - nums[i];
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
