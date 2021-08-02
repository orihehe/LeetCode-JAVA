package com.company.solution.week15.orihehe;

// 67
// O(N)
public class AddBinary {

    private String fillZero(String origin, int size) {
        StringBuilder result = new StringBuilder();
        while (origin.length() + result.length() < size) {
            result.append('0');
        }
        result.append(origin);
        return result.toString();
    }

    private String addBinaryString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int up = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int ac = a.charAt(i) - '0';
            int bc = b.charAt(i) - '0';
            char c = (char)('0' + (ac + bc + up) % 2);
            result.append(c);

            if (ac + bc + up >= 2) {
                up = 1;
            } else {
                up = 0;
            }
        }
        if (up == 1) {
            result.append('1');
        }
        return result.reverse().toString();
    }

    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        a = fillZero(a, maxLen);
        b = fillZero(b, maxLen);
        return addBinaryString(a, b);
    }
}
