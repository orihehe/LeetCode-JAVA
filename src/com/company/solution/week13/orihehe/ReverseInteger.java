package com.company.solution.week13.orihehe;

// 7
// O(N)
public class ReverseInteger {

    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
        if ('-' == sb.charAt(sb.length() - 1)) {
            sb.deleteCharAt(sb.length() - 1);
            sb = new StringBuilder("-").append(sb);
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }
}
