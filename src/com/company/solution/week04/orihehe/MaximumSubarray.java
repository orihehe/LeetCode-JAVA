package com.company.solution.week04.orihehe;

// 53
// O(N)
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int ans = -100000, last = 0;
        for (int num : nums) {
            if (num + last >= 0) {
                last += num;
                ans = Math.max(ans, last);
            } else {
                last = 0;
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}
