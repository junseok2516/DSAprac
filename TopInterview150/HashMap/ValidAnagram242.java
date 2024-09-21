package HashMap;

import java.util.Arrays;

public class ValidAnagram242 {
    boolean isAnagram(String s, String t) {
        // HashMap Approach
        // 18ms 16.70%
        // if (s.length() != t.length()) return false;
        // Map<Character, Integer> mapS = new HashMap<>();
        // char[] charS = s.toCharArray();
        // for (char c : charS) {
        //     mapS.put(c, mapS.getOrDefault(c, 0) + 1);
        // }
        // for (int i = 0; i < t.length(); i++) {
        //     if (mapS.get(t.charAt(i)) == null || mapS.get(t.charAt(i)) < 1) {
        //         return false;
        //     }
        //     mapS.put(t.charAt(i), mapS.get(t.charAt(i)) - 1);
        // }
        // return true;

        // Sorting approach
        // 4ms 73.40%
        if (s.length() != t.length()) return false;
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedS);
        Arrays.sort(sortedT);
        for (int i = 0; i < sortedS.length; i++) {
            if (sortedS[i] != sortedT[i]) return false;
        }
        return true;
    }
}
