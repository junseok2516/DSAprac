package PrefixSums;

import java.util.ArrayList;
import java.util.List;

class RangeSumQuery_Immutable303 {
    List<Integer> prefixSum = new ArrayList<>();
    public RangeSumQuery_Immutable303(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
            prefixSum.add(total);
        }
    }

    public int sumRange(int left, int right) {
        int prefixSumRight = prefixSum.get(right);
        int prefixSumLeft = left != 0 ? prefixSum.get(right-1) : 0;
        return prefixSumRight-prefixSumLeft;
    }
}
