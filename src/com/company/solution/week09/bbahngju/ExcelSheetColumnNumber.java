package com.company.solution.week09.bbahngju;

//171
//O(N)
public class ExcelSheetColumnNumber {
    public int titleToNumber(String columnTitle) {
        int answer = 0;
        int endIdx = columnTitle.length()-1;
        char alpha;

        for(int i = endIdx; i >= 0; i--) {
            alpha = columnTitle.charAt(i);
            answer += (Math.pow(26, endIdx-i) * (alpha - 'A' + 1));
        }

        return answer;
    }
}
