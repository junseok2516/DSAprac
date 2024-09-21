package Array_String;

public class validPalindrome125 {
    static boolean isPalindrome(String s) {
        // find keywords to apply to the String to trim
        // 14ms 34.42%
        String trimmedS = s.toLowerCase().trim().replaceAll("[^0-9a-z]", "");
        for (int i = 0; i < trimmedS.length() / 2; i++) {
            if (!(trimmedS.charAt(i) == trimmedS.charAt(trimmedS.length() - i - 1))) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}
