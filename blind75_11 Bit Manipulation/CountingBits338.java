import java.util.Arrays;

public class CountingBits338 {
    static int[] countBits(int n) {
        int[] result = new int[n+1];
        for (int i = 0; i <= n; i++) {
            result[i] = (i & 1) + result[i>>1];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}
