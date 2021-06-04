package com.company.solution.week12.orihehe;

import java.util.ArrayList;
import java.util.List;

// 17
// O(4^4)
public class LetterCombinationsOfAPhoneNumber {

    String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() > 0) {
            dfs(ans, digits, new StringBuilder(), 0);
        }
        return ans;
    }

    private void dfs(List<String> ans, String digits, StringBuilder prev, int index) {
        if (index >= digits.length()) {
            ans.add(prev.toString());
            return;
        }
        int mp = digits.charAt(index) - '0';
        for (char m : mapping[mp].toCharArray()) {
            dfs(ans, digits, prev.append(m), index + 1);
            prev.deleteCharAt(index);
        }
    }
}
