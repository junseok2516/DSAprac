import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DP1D {
    // Fibonacci Solution by DP
    // 01 Brute Force way
    static int bruteForce(int n) {
        if (n < 2) return n;
        return bruteForce(n-2) + bruteForce(n-1);
    }

    // DP01 Top-down way
    static int topDown(int n) {
        int[] arr = new int[n+1];
        if (n < 2) return n;
        if (arr[n] != 0) return arr[n];
        arr[0] = 0; arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }

    // DP02 Bottom-up way
    static int bottomUp(int n) {
        if (n < 2) return n;
        int[] arr = {0, 1};
        int i = 2;
        while (i <= n) {
            int tmp = arr[1];
            arr[1] = arr[0] + arr[1];
            arr[0] = tmp;
            i++;
        }
        return arr[1];
    }

    public static void main(String[] args) {
        System.out.println(bruteForce(5));
        System.out.println(topDown(5));
        System.out.println(bottomUp(5));
    }
}
