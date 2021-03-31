package com.company.solution.week02.bbahngju;

import java.util.Stack;

//O(N)
public class ValidParentheses {
    class Solution {
        public boolean isValid(String s) {

            if(s.length() % 2 != 0) return false;

            char[] brankets = s.toCharArray();
            Stack<Character> stack = new Stack<>();

            for(char branket : brankets) {
                if(branket == '(' || branket == '[' || branket == '{')
                    stack.push(branket);
                else {
                    if(stack.empty()) return false;
                    else{
                        char open = stack.pop();
                        if(!Check(open, branket)) return false;
                    }
                }

            }

            if(!stack.empty()) return false;
            return true;
        }

        public boolean Check(char open, char close) {
            if(open == '(' && close == ')') return true;
            if(open == '[' && close == ']') return true;
            if(open == '{' && close == '}') return true;

            return false;
        }
    }
}
