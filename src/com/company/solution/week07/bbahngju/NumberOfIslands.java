package com.company.solution.week07.bbahngju;

import java.util.LinkedList;
import java.util.Queue;

//200
//O(NM)
public class NumberOfIslands {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int numIslands(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        boolean[][] visited = new boolean[r][c];
        int answer = 0;

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j, grid, visited);
                    answer++;
                }
            }
        }

        return answer;
    }

    public void bfs(int x, int y, char[][] grid, boolean[][] v) {
        Queue<Point> q = new LinkedList<>();
        Point p;
        int nextX, nextY;
        int r = grid.length;
        int c = grid[0].length;

        q.add(new Point(x, y));
        while(!q.isEmpty()) {
            p = q.poll();

            for(int i=0; i<4; i++) {
                nextX = p.x + dx[i];
                nextY = p.y + dy[i];

                if(nextX >= 0 && nextX < r && nextY >= 0 && nextY < c
                        && !v[nextX][nextY] && grid[nextX][nextY] == '1') {
                    q.add(new Point(nextX, nextY));
                    v[nextX][nextY] = true;
                }
            }
        }
    }
}
