import java.util.Arrays;

public class SortanArray912 {
    static int[] mergeSort(int[] arr, int s, int e) {
        if (s == e) return arr; // base case

        int m = (s + e) / 2;
        mergeSort(arr, s, m); // left half array
        mergeSort(arr, m+1, e); // right half array
        merge(arr,s,m,e); // merge both subarrays

        return arr;
    }

    static void merge(int[] arr, int l, int m, int r) {
        int length01 = m - l + 1; // length of left half
        int length02 = r - m; // length of right half

        int[] L = new int[length01]; // tmp array for the left half subarray
        int[] R = new int[length02]; // tmp array for the right half subarray

        for (int i = 0; i < length01; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < length02; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0; int j = 0; int k = l; // i for L[i], j for R[j] and k for starting index of a given array
        while (i < length01 && j < length02) { // both arrays have still elements
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < length01) { // right array (R[j]) is gone and left array is left
            arr[k] = L[i];
            k++;
            i++;
        }
        while (j < length02) { // left array (L[i]) is gone and right array is left
            arr[k] = R[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }
}