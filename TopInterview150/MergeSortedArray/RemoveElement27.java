package MergeSortedArray;

public class RemoveElement27 {
    // do not try to write down the code right away as this has been solved before
    // keep checking my thought step by step, O(n)
    int removeElement(int[] nums, int val) {
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[left++] = nums[i];
        }
        return left;
    }
}
