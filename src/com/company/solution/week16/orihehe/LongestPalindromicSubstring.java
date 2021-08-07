package com.company.solution.week16.orihehe;

// 5
// O(N^2)
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        String result = "";
        int n = s.length();
        boolean[][] dp = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j + i < n; j++) {
                dp[j][j + i] = ((j + 1 > j + i - 1) || (dp[j + 1][j + i - 1])) && s.charAt(j) == s.charAt(j + i);
                if (dp[j][j + i]) {
                    result = s.substring(j, j + i + 1);
                }
            }
        }
        return result;
    }
}
