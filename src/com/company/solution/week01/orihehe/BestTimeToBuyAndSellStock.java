package com.company.solution.week01.orihehe;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        final int sz = prices.length;

        int[] mn = new int[sz];
        int[] mx = new int[sz];

        Arrays.fill(mn, 10001);

        int ans = 0;
        mn[0] = prices[0];
        for (int i = 1; i < sz; i++) {
            mn[i] = Math.min(mn[i - 1], prices[i]);
        }
        mx[sz - 1] = prices[sz - 1];
        for (int i = sz - 2; i >= 0; i--) {
            mx[i] = Math.max(mx[i + 1], prices[i]);
        }
        for (int i = 0; i < sz - 1; i++) {
            ans = Math.max(ans, mx[i + 1] - mn[i]);
        }
        return ans;
    }
}
