package com.company.solution.week13.bbahngju;

//238
//O(N)
public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];

        int value = 1;
        for(int i = 0; i < nums.length; i++) {
            answer[i] = value;
            value *= nums[i];
        }

        value = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= value;
            value *= nums[i];
        }

        return answer;
    }
}
