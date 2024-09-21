package Array_String;

public class isSubsequence392 {
    static boolean isSubsequence(String s, String t) {
        // 2ms 59.03%
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
//            if (s.charAt(i) == t.charAt(j)) {
//                i++; j++;
//            } else {
//                j++;
//            }
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
