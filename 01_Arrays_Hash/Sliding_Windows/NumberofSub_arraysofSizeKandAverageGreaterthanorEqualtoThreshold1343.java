package Sliding_Windows;

import java.util.ArrayList;
import java.util.List;

public class NumberofSub_arraysofSizeKandAverageGreaterthanorEqualtoThreshold1343 {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int l = 0; int cnt = 0; int tempSum = 0;
        for (int r = 0; r < arr.length; r++) {
            if (r - l >= k) {
                tempSum -= arr[l];
                l += 1;
            }
            tempSum += arr[r];
            if (r - l + 1 >= k && tempSum / k >= threshold) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,5,8};
        System.out.println(numOfSubarrays(arr, 3, 4));
    }
}
