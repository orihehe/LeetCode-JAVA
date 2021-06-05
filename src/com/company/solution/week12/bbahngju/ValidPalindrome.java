package com.company.solution.week12.bbahngju;

//125
//O(N)
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String input = s.toLowerCase();

        int left, right;
        left = 0; right = input.length()-1;
        while(left <= right) {
            if(!isAlphanumeric(input.charAt(left))) {
                left++;
                continue;
            }
            if(!isAlphanumeric(input.charAt(right))) {
                right--;
                continue;
            }

            if(input.charAt(left) != input.charAt(right)){
                break;
            }

            left++;
            right--;
        }

        return left > right;
    }

    public boolean isAlphanumeric(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'));
    }
}
