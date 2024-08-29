package Array_String;

public class RemoveDuplicatesfromSortedArray26 {
    // though too much about switching duplicated one (but instead turns out not dupulicated one move)
    // O(n) iterating only for the length of the given arr
    static int removeDuplicates(int[] nums) {
        int left = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] != nums[i]) nums[left++] = nums[i];
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
