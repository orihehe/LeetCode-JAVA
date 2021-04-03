package com.company.solution.week03.bbahngju;

//O(N)
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
       int move = 0;
       for(int n : nums) {
           if(n != 0){
               nums[move++] = n;
           }
       }
       if(move != nums.length) {
           for(int i=move; i<nums.length; i++) {
               nums[i] = 0;
           }
       }
    }
}
