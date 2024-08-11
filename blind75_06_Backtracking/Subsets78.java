import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Subsets78 {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) return result;

        backtracking(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    void backtracking(int[] nums, ArrayList<Integer> temp, int index) {
        if (index >= nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        // includes the element
        temp.add(nums[index]);
        backtracking(nums, temp, index + 1);


        // don't include the element
        temp.remove(temp.size() - 1);
        backtracking(nums, temp, index + 1);
    }
}
