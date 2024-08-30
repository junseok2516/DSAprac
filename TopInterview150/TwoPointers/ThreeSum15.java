package TwoPointers;

import java.util.*;

public class ThreeSum15 {
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < nums.length-2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i]+nums[j]+nums[k] > 0) {
                    k--;
                } else if (nums[i]+nums[j]+nums[k] < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                }
            }
        }
        List<List<Integer>> newAns = new ArrayList<>(ans);
        return newAns;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }
}
