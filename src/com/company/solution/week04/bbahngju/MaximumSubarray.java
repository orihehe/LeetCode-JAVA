package com.company.solution.week04.bbahngju;

//O(N)
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        for(int i=1; i<nums.length; i++) {
            curSum = (curSum+nums[i] < nums[i]) ? nums[i] : curSum+nums[i];
            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum;
    }
}
