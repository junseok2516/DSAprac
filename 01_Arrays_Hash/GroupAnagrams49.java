import java.util.*;

public class GroupAnagrams49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sortedStr = new HashMap<>();
        for (String str : strs) {
            char[] tempStr = str.toCharArray();
            Arrays.sort(tempStr);
            if (!sortedStr.containsKey(Arrays.toString(tempStr))) {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                sortedStr.put(Arrays.toString(tempStr), tempList);
            } else {
                sortedStr.get(Arrays.toString(tempStr)).add(str);
            }
        }
        return List.copyOf(sortedStr.values());
    }

    public static void main(String[] args) {
        String[] tempStr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(tempStr));
    }
}
