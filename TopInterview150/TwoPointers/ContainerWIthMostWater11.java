package TwoPointers;

public class ContainerWIthMostWater11 {
    static int maxArea(int[] height) {
        // 4ms  88.60% 5m39s O(n0
        // moving the smaller element of two pointers so the size of dam can have larger
        int dam = 0;
        int p1 = 0, p2 = height.length - 1;
        for (int i = 0; i < height.length; i++) {
            if (height[p1] > height[p2]) {
                dam = Math.max(dam, height[p2] * (p2 - p1));
                p2--;
            } else {
                dam = Math.max(dam, height[p1] * (p2 - p1));
                p1++;
            }
        }
        return dam;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,1}));
    }
}
