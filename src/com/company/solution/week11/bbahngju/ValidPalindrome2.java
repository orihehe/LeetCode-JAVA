package com.company.solution.week11.bbahngju;

//680
//O(N)
public class ValidPalindrome2 {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int left, right;

        boolean isDelete = true;
        boolean isSuccess = true;
        left = 0; right = n-1;
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                if(isDelete) {
                    left++;
                    isDelete = false;
                    continue;
                }
                else {
                    isSuccess = false;
                    break;
                }
            }
            left++;
            right--;
        }

        if(isSuccess) return true;

        isDelete = true; isSuccess = true;
        left = 0; right = n-1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                if(isDelete) {
                    right--;
                    isDelete = false;
                    continue;
                }
                else {
                    isSuccess = false;
                    break;
                }
            }
            left++;
            right--;
        }

        return isSuccess;
    }
}
