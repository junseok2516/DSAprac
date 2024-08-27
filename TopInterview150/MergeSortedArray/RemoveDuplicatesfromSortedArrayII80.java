package MergeSortedArray;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII80 {
    // at most two duplicated elements can leave
    // use two pointers to maintain the arr as well as output k
    static int removeDuplicates(int[] nums) {
        int left = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[left-2]) {
                nums[left++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(nums));
    }
}
