package TwoPointers;

import java.util.*;

public class ThreeSum15 {
    static List<List<Integer>> threeSum(int[] nums) {
        // 864ms 10.99%, mem O(n), time O(n^2 log n)
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for (int p1 = 0; p1 < nums.length - 2; p1++) {
            int p2 = p1 + 1;
            int p3 = nums.length - 1;
            while (p2 < p3) {
                List<Integer> tmp = new LinkedList<>();
                if (nums[p1] + nums[p2] + nums[p3] == 0) {
                    res.add(Arrays.asList(nums[p1], nums[p2], nums[p3]));
                    p2++; p3--;
                } else if (nums[p1] + nums[p2] + nums[p3] < 0) {
                    p2++;
                } else {
                    p3--;
                }
            }
        }
        return new LinkedList<>(res);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }
}
