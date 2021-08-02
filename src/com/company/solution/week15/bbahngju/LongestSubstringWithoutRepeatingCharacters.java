package com.company.solution.week15.bbahngju;

//3
//O(N)
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        StringBuilder sub = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int position = sub.toString().indexOf(cur);
            if(position != -1) {
                sub.delete(0, position + 1);
            }
            sub.append(cur);

            answer = Math.max(answer, sub.length());
        }

        return answer;
    }
}
