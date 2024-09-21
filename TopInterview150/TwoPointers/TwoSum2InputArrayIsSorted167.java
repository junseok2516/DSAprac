package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2InputArrayIsSorted167 {
    static int[] twoSum(int[] numbers, int target) {
        // 6ms 16.92% O(n)
        // key is comparing target - numbers[i] whether it is in the hashmap
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            if (map.containsKey(target-numbers[i])) {
//                return new int[]{map.get(target - numbers[i])+1, i + 1};
//            } else {
//                map.put(numbers[i], i);
//            }
//        }
//        return new int[]{};

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (m.containsKey(target-numbers[i])) {
                return new int[]{i+1, m.get(target-numbers[i])};
            } else {
                m.put(numbers[i], i+1);
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15}; int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
