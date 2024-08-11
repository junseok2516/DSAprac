import java.util.Arrays;

public class KthLargestElementinanArray215 {
//    public static int findKthLargest(int[] nums, int k) {
//        if (nums.length == 1) return nums[0];
//        mergeSort(nums, 0, nums.length - 1);
////        System.out.println(Arrays.toString(nums));
//        return nums[nums.length - k];
//    }
//
//    static void mergeSort(int[] arr, int s, int e) {
//        int m = (s + e) / 2;
//        mergeSort(arr, s, m);
//        mergeSort(arr, m + 1, e);
//        merge(arr, s, m, e);
//    }
//
//    static int[] merge(int[] arr, int l, int m, int r) {
//        int length01 = m - l + 1;
//        int length02 = r - m;
//
//        int[] L = new int[length01];
//        int[] R = new int[length02];
//        for (int i = 0; i < length01; i++) {
//            L[i] = arr[l + i];
//        }
//        for (int i = 0; i < length01; i++) {
//            R[i] = arr[m + 1 + i];
//        }
//
//        int i = 0; int j = 0; int k = l;
//        while (i < length01 && j < length02) {
//            if (L[i] < R[j]) {
//                arr[k] = L[i];
//                i++;
//            } else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < length01) {
//            arr[k] = L[i];
//            i++; k++;
//        }
//        while (j < length02) {
//            arr[k] = R[j];
//            j++; k++;
//        }
//        return arr;
//    }



    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4}; int k = 2;
//        System.out.println(findKthLargest(arr, k));
    }
}
