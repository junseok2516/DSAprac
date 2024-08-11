import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> nov = new HashMap<>();
        for (int i : nums) {
            if (nov.containsKey(i)) {
                return true;
            } else {
                nov.put(i, nov.getOrDefault(i, 0) + 1);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,1,3,4};
//        containsDuplicate(nums);
        System.out.println(containsDuplicate(nums));
    }
}