package com.company.solution.week16.bbahngju;

//5
//O(N^2)
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String answer = "";

        if(s.length() <= 1) return s;

        for(int i = 0; i < s.length() - 1; i++) {
            String even = search(i, i + 1, s);
            String odd = search(i, i + 2, s);

            if(even.length() >= odd.length()) {
                if(even.length() > answer.length())
                    answer = even;
            }
            else {
                if(odd.length() > answer.length())
                    answer = odd;
            }
        }

        return answer;
    }

    public String search(int start, int end, String s) {
        while(start >= 0 && end < s.length() && (s.charAt(start) == s.charAt(end))) {
            start--;
            end++;
        }
        return s.substring(start + 1, end);
    }
}