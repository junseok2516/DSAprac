package TwoPointers;

import java.util.Arrays;

public class ValidPalindrome125 {
    // need to think of what functions should be used for change case and replace what letters
    // still should be familiar with those
    static boolean isPalindrome(String s) {
        String trimmedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int m = trimmedS.length() / 2;
        int p = trimmedS.length() - 1;
        for (int i = 0; i < m; i++) {
            if (trimmedS.charAt(i) != trimmedS.charAt(p--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));

    }
}
