public class LongestCommonSubsequence1143 {
    static int longestCommonSubsequence(String text1, String text2) {
        // bottom up 2D DP
        // i) if matched, 1 + diagonal
        // ii) it not matched, Max of the right and the bottom
        // keep going up to dp[0][0]
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for (int i = text1.length() - 1; i >= 0; i--) {
            for (int j = text2.length() - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        String text1 = "ezupkr"; String text2 = "ubmrapg";
        System.out.println(longestCommonSubsequence(text1,text2));
    }
}
