package com.company.solution.week05.orihehe;

import java.util.Arrays;

// 1027
// O(N * M) N is length of A, M is range of A[i]
public class LongestArithmeticSubsequence {

    public int longestArithSeqLength(int[] A) {
        int ans = 1;
        int[] dp = new int[501];

        for (int gap = -500; gap <= 500; gap++) {
            Arrays.fill(dp, 0);
            for (int val : A) {
                if (0 <= val + gap && val + gap <= 500)
                    dp[val] = Math.max(dp[val + gap] + 1, dp[val]);
                else
                    dp[val] = Math.max(dp[val], 1);
                ans = Math.max(ans, dp[val]);
            }
        }
        return ans;
    }
}
