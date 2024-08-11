import java.util.Arrays;

public class BucketSort {
    static int[] bucketSort(int[] arr) {
        int[] countElement = {0,0,0,0};

        // count each value in an array
        for (int num : arr) {
            countElement[num] += 1;
        }

        // create new array with the smae length of the given array
        int[] sortedArr = new int[arr.length];

        // fill up the new array with the value from the counted array in order
        int cnt = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < countElement[i]; j++) {
                sortedArr[cnt] = i;
                cnt++;
            }
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        // only 0, 1, 2 and 3 values are existed in a given array
        int[] arr = {0,0,2,1,1,2,3,3,1};
        System.out.println(Arrays.toString(bucketSort(arr)));
    }
}


