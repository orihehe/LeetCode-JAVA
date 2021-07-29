package com.company.solution.week15.bbahngju;

//67
//O(N) N is Math.max(a.length, b.length)
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();

        int idxA = a.length() - 1;
        int idxB = b.length() - 1;

        int up = 0;
        while(idxA >= 0 || idxB >= 0) {
            int numA = (idxA >= 0) ? a.charAt(idxA) - '0' : 0;
            int numB = (idxB >= 0) ? b.charAt(idxB) - '0' : 0;

            int hap = sum(numA, numB) + up;
            int cur = hap % 2;
            up = hap / 2;

            answer.insert(0, cur);
            idxA--;
            idxB--;
        }

        if(up != 0)
            answer.insert(0, up);

        return answer.toString();
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
