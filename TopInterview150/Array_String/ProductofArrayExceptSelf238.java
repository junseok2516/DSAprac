package Array_String;

import java.util.Arrays;

public class ProductofArrayExceptSelf238 {
    static int[] productExceptSelf(int[] nums) {
        // 12:14 using another computation for the left took time
        int[] answer = new int[nums.length];
        answer[0] = 1;
        // multiplication to the right
        for (int i = 1; i < nums.length; i++) {
            answer[i] = answer[i-1] * nums[i-1];
        }
        // multiplication to the left
        int temp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            temp *= nums[i+1];
            answer[i] = answer[i] * temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
