package Sliding_Windows;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters003 {
    public static int lengthOfLongestSubstring(String s) {
        int l = 0; int len = 0;
        Set<Character> substr = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (substr.contains(s.charAt(r))) {
                substr.remove(s.charAt(l));
                l++;
            }
            substr.add(s.charAt(r));
            len = Math.max(len, r-l+1);
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "au";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
