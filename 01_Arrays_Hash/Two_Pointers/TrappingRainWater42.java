package Two_Pointers;

public class TrappingRainWater42 {
    public static int trap(int[] height) {
        int left = 0; int right = height.length-1;
        int leftMax = height[left]; int rightMax = height[right];
        int trappedWater = 0;
        while (left < right) {
            if (leftMax <= rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedWater += rightMax - height[right];
            }
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
}
