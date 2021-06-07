package com.company.solution.week12.bbahngju;

import java.util.ArrayList;
import java.util.List;

//17
//O(4^4)
public class LetterCombinationsOfAPhoneNumber {
    private char[][] digit = {{'a','b','c'}, {'d','e','f'},
            {'g','h','i'}, {'j','k','l'},
            {'m','n','o'}, {'p','q','r','s'},
            {'t','u','v'}, {'w','x','y','z'}};

    private List<String> answer = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0)
            return answer;

        mapDigits(0, digits.length(), digits, "");
        return answer;
    }

    public void mapDigits(int cnt, int len, String digits, String cur) {
        if(cnt == len) {
            answer.add(cur);
            return;
        }

        int curNum = digits.charAt(cnt) - '2';
        for(int i = 0; i < digit[curNum].length; i++) {
            mapDigits(cnt+1, len, digits, cur + digit[curNum][i]);
        }
    }
}
