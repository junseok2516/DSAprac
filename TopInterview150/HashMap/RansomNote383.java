package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        // 11ms 45.46%
        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            // if (map.containsKey(c)) {
            //     if (map.get(c) > 0) {
            //         map.put(c, map.get(c) - 1);
            //     } else {
            //         return false;
            //     }
            // } else {
            //     return false;
            // }
            if (!map.containsKey(c) || map.get(c) <= 0) {
                return false;
            }
            map.put(c, map.get(c) - 1);
        }
        return true;
    }
}
