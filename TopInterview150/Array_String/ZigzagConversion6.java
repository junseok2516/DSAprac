package Array_String;

public class ZigzagConversion6 {
    static String convert(String s, int numRows) {
        // well found the pattern of (numRows - 1) * 2
        // but missed second pattern that is between 0 and numRows - 1 (exclusive)
        // 14ms 26.9%
        if (numRows == 1) return s;
        String res = "";
        for (int i = 0; i < numRows; i++) {
            int term = (numRows - 1) * 2;
            for (int j = i; j < s.length(); j+=term) {
                res += s.charAt(j);
                if (i > 0 && i < numRows - 1) {
                    int term1 = (numRows - 1) * 2 - i * 2;
                    if (j + term1 < s.length()) res += s.charAt(j + term1);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING"; int numRows = 4;
        System.out.println(convert(s, numRows));
    }
}
