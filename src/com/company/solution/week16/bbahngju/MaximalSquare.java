package com.company.solution.week16.bbahngju;

//221
//O(NM)
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {
        int answer = 0;
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row + 1][col + 1];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == '1') {
                    dp[i+1][j+1] = Math.min(Math.min(dp[i][j], dp[i+1][j]), dp[i][j+1]) + 1;
                    answer = Math.max(answer, dp[i+1][j+1]);
                }
            }
        }


        return answer * answer;
    }
}
