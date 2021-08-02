package com.company.solution.week15.orihehe;

import java.util.HashMap;
import java.util.Map;

// 3
// O(N)
public class LongestSubstringWithoutRepeatingCharacters {

    private final Map<Character, Integer> indexMap = new HashMap<>();

    private int getIndex(char c) {
        if (!indexMap.containsKey(c)) {
            indexMap.put(c, indexMap.size());
        }
        return indexMap.get(c);
    }

    public int lengthOfLongestSubstring(String s) {
        boolean[] used = new boolean[50000];
        int maxLen = 0, l = 0, curLen = 0;
        for (int r = 0; r < s.length(); r++) {
            int curCharIdx = getIndex(s.charAt(r));
            while (used[curCharIdx]) {
                used[getIndex(s.charAt(l++))] = false;
                --curLen;
            }
            used[curCharIdx] = true;
            maxLen = Math.max(maxLen, ++curLen);
        }
        return maxLen;
    }
}
