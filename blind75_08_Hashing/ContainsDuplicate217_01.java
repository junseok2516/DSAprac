import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217_01 {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int num : nums) {
            if (result.containsKey(num)) {
                return true;
            } else {
                result.put(num, result.getOrDefault(num, 0) + 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
