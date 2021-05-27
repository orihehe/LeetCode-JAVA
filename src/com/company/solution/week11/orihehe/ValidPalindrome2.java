package com.company.solution.week11.orihehe;

// 680
// O(N)
public class ValidPalindrome2 {

    public boolean validPalindrome(String s) {
        int f = 0, e = s.length() - 1;
        while (f < e) {
            if (s.charAt(f) != s.charAt(e)) {
                return isPalindrome(s, f) || isPalindrome(s, e);
            }
            f++; e--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int ignoreIdx) {
        int f = 0, e = s.length() - 1;
        while (f < e) {
            if (f == ignoreIdx) f++;
            if (e == ignoreIdx) e--;
            if (s.charAt(f) != s.charAt(e)) return false;
            f++; e--;
        }
        return true;
    }
}
