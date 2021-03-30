package com.company.solution.week02.orihehe;

import java.util.Stack;

public class ValidParentheses {

    private boolean isPairBracket(char f, char s) {
        if (f == '(' && s == ')') return true;
        if (f == '{' && s == '}') return true;
        if (f == '[' && s == ']') return true;
        return false;
    }

    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                sta.push(c);
                continue;
            }
            if (sta.empty() || !isPairBracket(sta.peek(), c)) return false;
            sta.pop();
        }
        return sta.empty();
    }
}
