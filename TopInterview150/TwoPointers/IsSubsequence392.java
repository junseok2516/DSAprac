package TwoPointers;

public class IsSubsequence392 {
    static boolean isSubsequence(String s, String t) {
        int p1 = 0, p2 = 0;
        while (p1 < s.length() && p2 < t.length()) {
            if (s.charAt(p1) == t.charAt(p2)) p1++;
            p2++;
        }

        return p1 == s.length();
    }

    public static void main(String[] args) {
        String s = "adc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
