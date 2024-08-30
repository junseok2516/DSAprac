package Array_String;

public class JumpGameII45 {
    static int jump(int[] nums) {
        // visiting each possible jump(level) to the next level is the key
        // windows are re-arranged
        int l=0,r=0,res=0;
        while (r < nums.length - 1) {
            int farthest = 0;
            for (int i = l; i <= r; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            l=r+1;
            r=farthest;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(jump(new int[]{2,3,1,1,4}));
    }
}
