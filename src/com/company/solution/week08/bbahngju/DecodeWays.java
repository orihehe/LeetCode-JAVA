package com.company.solution.week08.bbahngju;

//91
//O(N)
public class DecodeWays {
    public int numDecodings(String s) {
        if(s.charAt(0) == '0') return 0;

        int tot;
        int[] dp = new int[s.length()+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 1; i < s.length(); i++) {
            tot = 0;
            if(s.charAt(i)-'0' > 0) {
                tot += dp[i];
            }
            if(s.charAt(i-1) == '1' || (s.charAt(i-1) == '2' && s.charAt(i)-'0' <= 6)) {
                tot += dp[i-1];
            }
            dp[i+1] = tot;
        }
        return dp[s.length()];
    }
}
