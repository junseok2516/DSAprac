import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int[] arr, int s, int e) {
        if (s == e) return arr;

        int m = (s + e) / 2;
        mergeSort(arr, s, m);
        mergeSort(arr, m + 1, e);
        merge(arr, s, m, e);

        return arr;
    }

    static void merge(int[] arr, int l, int m, int r) {
        int length01 = m - l + 1;
        int length02 = r - m;

        int[] L = new int[length01];
        int[] R = new int[length02];
        for (int i = 0; i < length01; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < length02; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0; int j = 0; int k = l;
        while (i < length01 && j < length02) {
            if (L[i] <= R[i]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < length01) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < length02) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length - 1)));
    }
}
