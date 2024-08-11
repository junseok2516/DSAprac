package Sliding_Windows;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII80 {
    public static int removeDuplicates(int[] nums) {
        int l = 0; int r = 0;
        while (r < nums.length) {
            int cnt = 1;
            while (r + 1 < nums.length && nums[r] == nums[r+1]) {
                nums[l] = nums[r];
                r++;
                cnt++;
            }
            for (int temp = 0; temp < Math.min(2, cnt); temp++) {
                nums[l] = nums[r];
                l++;
            }
            r++;

        }
        System.out.println(Arrays.toString(nums));
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
