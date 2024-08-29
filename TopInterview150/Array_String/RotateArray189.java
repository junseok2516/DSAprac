package Array_String;

import java.util.Arrays;

public class RotateArray189 {
    static void rotate(int[] nums, int k) {
        if (nums.length == 1) return;
        k = k % nums.length;
        numRotate(0, nums.length-k-1, nums);
        numRotate(nums.length-k, nums.length-1, nums);
        numRotate(0, nums.length-1, nums);
    }

    static void numRotate(int s, int e, int[] nums) {
        while (s < e) {
            int tmp = nums[s];
            nums[s] = nums[e];
            nums[e] = tmp;
            s++; e--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99}; int k = 2;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
