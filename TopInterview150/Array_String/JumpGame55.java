package Array_String;

public class JumpGame55 {
    static boolean canJump(int[] nums) {
        int jump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (jump < i) return false; // not reachable; case2
            jump = Math.max(jump, i + nums[i]); // by jumping the max, can compare the length == [length-2]
            // if (jump == nums[nums.length - 2]) return true; comment: not need to return true while iterating as it returns true at the end
        }
        // if not false then it assumes that it is reached.
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }
}
