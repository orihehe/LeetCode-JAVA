package com.company.solution.week03.orihehe;

// 283
// O(N)
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int firstZeroIdx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            while (firstZeroIdx + 1 < i && nums[firstZeroIdx] != 0)
                firstZeroIdx++;
            if (nums[firstZeroIdx] == 0) {
                nums[firstZeroIdx] = nums[i];
                nums[i] = 0;
            }
        }
    }
}