import java.util.*;

public class TopKFrequentElements347 {
    public static int[] topKFrequent(int[] nums, int k) {
        // number of appearance
        Map<Integer, Integer> noa = new HashMap<>();
        for (int num : nums) {
            noa.put(num, noa.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] orderNums = new List[nums.length + 1];
        for (int num : noa.keySet()) {
            if (orderNums[noa.get(num)] == null) {
                orderNums[noa.get(num)] = new ArrayList<>();
            }
            orderNums[noa.get(num)].add(num);
        }

        List<Integer> answer = new ArrayList<>();
        for (int i = nums.length; i > 0; i--) {
            if (orderNums[i] != null && answer.size() != k) {
                answer.addAll(orderNums[i]);
            }
        }
        System.out.println(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {-1,-1};
        topKFrequent(nums,1);
    }
}
