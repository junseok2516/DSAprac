package Array_String;

import java.util.Arrays;

public class MajorityElement169 {
    // ensure that the answer I wrote is correct
    // make sure running samples so the code is correct
    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] nums= {3,2,3};
        System.out.println(majorityElement(nums));
    }
}
