package Sliding_Windows;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        Set<Integer> res = new HashSet<>();
        for (int r = 0; r < nums.length; r++) {
            if (r - l > k) {
                res.remove(nums[l]);
                l += 1;
            }
            if (res.contains(nums[r])) {
                return true;
            }
            res.add(nums[r]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1}; int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
