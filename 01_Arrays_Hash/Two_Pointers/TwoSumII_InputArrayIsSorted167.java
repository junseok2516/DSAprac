package Two_Pointers;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted167 {
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0; int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] > target) {
                r--;
            } else if (numbers[l] + numbers[r] < target) {
                l++;
            } else {
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15}; int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
