package com.company.solution.week13.bbahngju;

import java.util.Stack;

//7
//O(N)
public class ReverseInteger {
    public int reverse(int x) {
        Stack<Long> digits = new Stack<>();
        int sign = 1;
        long number = x;
        long answer = 0L;

        if(x < 0) {
            number *= -1;
            sign = -1;
        }

        while(number != 0) {
            digits.add(number % 10);
            number /= 10;
        }

        int cnt = 1;
        long digit;
        while(!digits.empty()) {
            digit = digits.pop();
            answer += digit * cnt;
            cnt *= 10;
        }

        answer *= sign;
        if(answer < Integer.MIN_VALUE || answer > Integer.MAX_VALUE)
            return 0;
        return (int)answer;
    }
}
