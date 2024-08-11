import java.util.Arrays;

public class quickSort {
    static int[] quickSort(int[] arr, int s, int e) {
        if (e - s + 1 <= 1) return arr;

        int left = s;
        int pivot = arr[e];

        for (int i = s; i < e; i++) {
            if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[left];
                arr[left] = temp;
                left++;
            }
        }
        // change arr[left] <> pivot_index
        arr[e] = arr[left];
        arr[left] = pivot;

//        System.out.printf("s:%d e:%d pivot:%d left:%d\n",s,e,pivot,left);
        quickSort(arr, s, left - 1); // left from pivot_index
        quickSort(arr, left + 1, e); // right from pivot_index

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(quickSort(arr, 0, arr.length - 1)));
    }
}
