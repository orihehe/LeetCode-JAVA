package com.company.solution.week03.orihehe;

import java.util.HashSet;
import java.util.Set;

// 202
// N is at least 700 or less.
// O(N)
public class HappyNumber {

    private int nextNumber(int curNumber) {
        int result = 0;
        while (curNumber > 0) {
            result += Math.pow(curNumber % 10, 2);
            curNumber /= 10;
        }
        return result;
    }

    public boolean isHappy(int n) {
        Set<Integer> sss = new HashSet<>();
        while (!sss.contains(n)) {
            sss.add(n);
            n = nextNumber(n);
        }
        return sss.contains(1);
    }
}
