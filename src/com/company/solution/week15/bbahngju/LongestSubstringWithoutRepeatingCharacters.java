package com.company.solution.week15.bbahngju;

import java.util.HashMap;
import java.util.Map;

//3
//O(N)
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int start = 0;
        Map<Character, Integer> saveIdx = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            int idx = saveIdx.getOrDefault(cur, -1);
            if(idx == -1) {
                saveIdx.put(cur, i);
            }
            else {
                if(start <= idx) {
                    start = idx + 1;
                }
                saveIdx.put(cur, i);
            }
            answer = Math.max(answer, i-start+1);
        }

        return answer;
    }
}
