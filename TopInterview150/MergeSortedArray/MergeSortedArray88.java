package MergeSortedArray;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeSortedArray88 {
    // did not read carefully that the arr must be done in-place sorting
    // think of best possible way to save time and space
    // since ever using iterating p3 == 0 or p1 == 0, O(n+m)
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1; int p2=m+n-1; int p3=n-1;
        while (p3 >= 0) {
            if (p1 >= 0 && nums2[p3] > nums1[p1]) {
                nums1[p2--] = nums1[p1--];
            } else {
                nums1[p2--] = nums2[p3--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}; int[] nums2 = {2,5,6};
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
