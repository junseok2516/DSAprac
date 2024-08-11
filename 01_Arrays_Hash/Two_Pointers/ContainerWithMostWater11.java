package Two_Pointers;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int l = 0; int r = height.length-1;
        int maxHeight = Integer.MIN_VALUE;
        while (l < r) {
            maxHeight = Math.max(maxHeight, (r-l) * Math.min(height[r], height[l]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
}
