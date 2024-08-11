public class ClibmingStairs70 {
    static int climbStairs(int n) {
        // brute force
//        if (n < 3) return n;
//        return climbStairs(n-2) + climbStairs(n-1);

        // top-down
//        if (n < 3) return n;
//        int[] arr = new int[n+1];
//        arr[0] = 0; arr[1] = 1; arr[2] = 2;
//        for (int i = 3; i <= n; i++) {
//            arr[i] = arr[i-2] + arr[i-1];
//        }
//        return arr[n];

        // bottom-up
        if (n < 3) return n;
        int[] arr = {1,2};
        int i = 3;
        while (i <= n) {
            int tmp = arr[1];
            arr[1] = arr[1] + arr[0];
            arr[0] = tmp;
            i++;
        }
        return arr[1];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2)); // 2
        System.out.println(climbStairs(3)); // 3
        System.out.println(climbStairs(4)); // 5
        System.out.println(climbStairs(5)); // 8
    }
}
