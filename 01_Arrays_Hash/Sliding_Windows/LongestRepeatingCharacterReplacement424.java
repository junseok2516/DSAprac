package Sliding_Windows;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestRepeatingCharacterReplacement424 {
    public static int characterReplacement(String s, int k) {
        int l = 0; int count = 0;
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        List<Character> sortedChar = new ArrayList<>();

        for (int r = 0; r < s.length(); r++) {
            if (charS[l] == charS[r]) {
                sortedChar.add(charS[r]);
            } else {
                while (charS[l] != charS[r]) {
                    l++;
                }
                sortedChar.add(charS[r]);
            }
            if (sortedChar.size() == k) {
                count++;
                l++;
                sortedChar.clear();
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "AABABBA"; int k = 1;
        System.out.println(characterReplacement(s,k));
    }
}
