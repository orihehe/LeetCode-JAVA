package com.company.solution.week05.bbahngju;

//1027
//O(N^3)
public class LongestArithmeticSubsequence {
    public int longestArithSeqLength(int[] A) {
        int result = 2;
        for(int i=0; i<A.length; i++) {
            for(int j=i+1; j<A.length; j++) {
                int cnt = Bf(i, j, A);
                result = Math.max(result, cnt);
            }
        }
        return result;
    }

    public int Bf(int left, int right, int[] A) {
        int dif = A[left] - A[right];
        int next = A[right] - dif;
        int cnt = 2;

        for(int i=right+1; i<A.length; i++) {
            if(next < 0 || next > 500) break;
            if(A[i] == next) {
                cnt++;
                next = A[i]-dif;
            }
        }
        return cnt;
    }
}
