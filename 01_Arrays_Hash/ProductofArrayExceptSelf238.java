import java.util.Arrays;

public class ProductofArrayExceptSelf238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        // multiply from the left to the right
        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i-1] * answer[i-1];
        }

        // multiply from the right to the left
        int lTemp = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            lTemp *= nums[i+1];
            answer[i] *= lTemp;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
