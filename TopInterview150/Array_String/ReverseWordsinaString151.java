package Array_String;

import java.util.Arrays;

public class ReverseWordsinaString151 {
    static String reverseWords(String s) {
        String[] trimmedS = s.trim().split(" ");

        String res = "";
        for (int i = trimmedS.length - 1; i >= 0; i--) {
            if (!trimmedS[i].isEmpty()) {
                res += trimmedS[i];
                if (i != 0) {
                    res += " ";
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
