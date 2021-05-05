package com.company.solution.week07.orihehe;

// 200
// O(NM)
public class NumbersOfIslands {

    private static final int[] rgo = { 0, 1, 0, -1 };
    private static final int[] cgo = { 1, 0, -1, 0 };

    public int numIslands(char[][] grid) {
        int r = grid.length, c = grid[0].length;
        int ans = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if ('1' == grid[i][j]) {
                    dfs(grid, i, j);
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        for (int k = 0; k < 4; k++) {
            int nr = i + rgo[k];
            int nc = j + cgo[k];
            if (!isValidIndex(nr, nc, grid.length - 1, grid[0].length - 1)) {
                continue;
            }
            if (grid[nr][nc] == '1') {
                dfs(grid, nr, nc);
            }
        }
    }

    private boolean isValidIndex(int i, int j, int maxI, int maxJ) {
        return 0 <= i && i <= maxI && 0 <= j && j <= maxJ;
    }
}
