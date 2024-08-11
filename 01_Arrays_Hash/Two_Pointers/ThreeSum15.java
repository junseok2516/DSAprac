package Two_Pointers;

import java.util.*;

public class ThreeSum15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> answers = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int l = i+1; int r = nums.length-1;
            while (l < r) {
                if (nums[i] + nums[l] + nums[r] > 0) {
                    r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    answers.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                }
            }
        }
        List<List<Integer>> finalA = new ArrayList<>();
        finalA.addAll(answers);
        return finalA;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }
}
