package Array_String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestCommonPrefix14 {
    static String longestCommonPrefix(String[] strs) {
        // sort strs so the first and the last string can compare
        // the reason to sort is to check/compare the maximum difference between two strings
        Arrays.sort(strs);
        int count = 0;
        // for (int i = 0; i < strs[0].length(); i++) {
        // the reason to use while instead of for is
        // to make sure the "prefix" is in common on both strings
        while (count < strs[0].length()) {
            if (strs[0].charAt(count) == strs[strs.length - 1].charAt(count)) {
                count++;
            } else {
                break;
            }
        }
        return count == 0 ? "" : strs[0].substring(0, count);
    }

    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
