import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CombinationSum39 {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new LinkedList<>();
        if (candidates == null || candidates.length == 0 || target <= 0) {
            return result;
        }
        backtracking(candidates, new ArrayList<Integer>(), target, 0, 0);
        return  result;
    }

    void backtracking(int[] candidates, ArrayList<Integer> temp, int target, int count, int index) {
        if (count > target || index >= candidates.length) { // base case
            return;
        }
        if (count == target) {
            result.add(new LinkedList<>(temp));
            return;
        }

        temp.add(candidates[index]);
        count += candidates[index];
        backtracking(candidates, temp, target, count, index);


        count -= candidates[index];
        temp.remove(temp.size() - 1);
        backtracking(candidates, temp, target, count, index + 1);
    }
}
