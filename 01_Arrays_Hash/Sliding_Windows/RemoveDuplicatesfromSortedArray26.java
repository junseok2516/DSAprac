package Sliding_Windows;

public class RemoveDuplicatesfromSortedArray26 {
    public static int removeDuplicates(int[] nums) {
        int l = 1;
        for (int r = l; r < nums.length; r++) {
            if (nums[r] != nums[r-1]) {
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
