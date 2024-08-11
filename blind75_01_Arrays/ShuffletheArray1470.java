import java.util.Arrays;

public class ShuffletheArray1470 {
    public static int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] << 10;
            nums[i] = nums[i] | nums[i+n];
        }

        int left = nums.length - 1;
        for (int i = n-1; i >= 0; i--) {
            nums[left--] = nums[i] & 1023;
            nums[i] = nums[i] >>> 10;
            nums[left--] = nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7}; int n = nums.length / 2;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}
