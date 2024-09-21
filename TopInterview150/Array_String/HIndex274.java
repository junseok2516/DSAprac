package Array_String;

import java.util.Arrays;

public class HIndex274 {
    static int hIndex(int[] citations) {
        int[] count = new int[citations.length + 1];
        for (int citation:citations) {
            if (citation >= citations.length) {
                count[citations.length]++;
            } else {
                count[citation]++;
            }
        }

        int cnt = 0;
        for (int i = citations.length; i >= 0; i--) {
            cnt += count[i];
            if (cnt >= i) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{1,3,1}));
    }
}
