package Array_String;

public class FindtheIndexoftheFirstOccurrenceinaString28 {
    static int strStr(String haystack, String needle) {
        // ppable, ab
        // doesnt need to go through all "ppable" but consider the length of "ab"
        for (int i = 0; i < haystack.length() + 1 - needle.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                // not matched then just go to the next i
                // (i + j) indicates that i is not dependent of nested loop
                // so i does not move but j
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                if (j == needle.length() - 1) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "baaa";
        String needle = "aaa";
        System.out.println(strStr(haystack, needle));
    }
}
