package com.company.solution.week01.bbahngju;

public class BestTimetoBuyandSellStock {
    public static void main(String[] arg) {
        int[] prices = new int[]{7,6,4,3,1};
        int result = maxProfit(prices);
        System.out.println(result);
    }
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int maximum = 0;
        for(int i=1; i<prices.length; i++) {
            if(buy > prices[i]) {
                buy = prices[i];
                continue;
            }
            else{
                maximum = Math.max(maximum,prices[i]-buy);
            }
        }

        return maximum;
    }
}
