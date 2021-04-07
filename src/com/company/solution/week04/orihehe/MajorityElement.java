package com.company.solution.week04.orihehe;

import java.util.Arrays;

// 169
// O(NlogN)
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
