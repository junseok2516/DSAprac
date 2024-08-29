package TwoPointers;

public class ContainerWIthMostWater11 {
    static int maxArea(int[] height) {
        int currContainer = Integer.MIN_VALUE;
        int p1 = 0, p2 = height.length - 1;
        while (p1 < p2) {
            currContainer = Math.max(Math.min(height[p1], height[p2]) * (p2-p1), currContainer);
            if (height[p1] < height[p2]) {
                p1++;
            } else if (height[p1] > height[p2]) {
                p2--;
            } else {
                p1++; p2--;
            }
        }
        return currContainer;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,1}));
    }
}
