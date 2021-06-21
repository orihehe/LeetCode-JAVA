package com.company.solution.week14.orihehe;

// 982
// O(2^16 * N)
public class TriplesWithBitwiseAndEqualToZero {

    int[] dp = new int[1<<16];

    public int countTriplets(int[] nums) {
        for (int num : nums) {
            for (int j = 0; j < (1 << 16); j++) {
                if ((num & j) == 0) {
                    dp[j]++;
                }
            }
        }
        int ans = 0;
        for (int num1 : nums) {
            for (int num2 : nums) {
                ans += dp[num1 & num2];
            }
        }
        return ans;
    }
}
