package com.company.solution.week09.orihehe;

// 171
// O(N)
public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {
        int p = 1, ans = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            int alpha = columnTitle.charAt(i) - 'A' + 1;
            ans += alpha * p;
            p *= 26;
        }
        return ans;
    }
}
