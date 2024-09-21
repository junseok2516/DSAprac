package SlidingWindows;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {
    static int lengthOfLongestSubstring(String s) {
        // Using pointers one to iterate in s, and the other one is to check duplication
        // was hard to put other pointer keep removing until it gets removed in set
        // 6ms Beats 69.46% O(n) O(n)
        int maxLen = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        int p2 = 0;
        for (int p1 = 0; p1 < s.length(); p1++) {
            while (set.contains(s.charAt(p1))) {
                set.remove(s.charAt(p2++));
            }
            set.add(s.charAt(p1));
            maxLen = Math.max(maxLen, p1 - p2 + 1);
        }
        return maxLen == Integer.MIN_VALUE ? 0 : maxLen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
