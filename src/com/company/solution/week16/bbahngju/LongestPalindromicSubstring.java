package com.company.solution.week16.bbahngju;

//5
//O(N^2)
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String answer = "";

        if(s.length() <= 1) return s;

        for(int i = 0; i < s.length() - 1; i++) {
            String even = search(i, i + 1, s);
            String odd = search(i, i, s);

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

    public String search(int left, int right, String s) {
        int start, end;

        while(left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }

        start = left + 1;
        end = right - 1;

        if(start > end) return "";
        return s.substring(start, end + 1);
    }
}