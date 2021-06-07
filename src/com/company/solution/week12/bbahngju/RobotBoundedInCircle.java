package com.company.solution.week12.bbahngju;

//1041
//O(N)
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        int direct = 0;
        int x = 0, y = 0;

        for (char order : instructions.toCharArray()) {
            if (order == 'L') {
                direct = (direct - 1 < 0) ? 3 : direct - 1;
                continue;
            }
            if (order == 'R') {
                direct = (direct + 1) % 4;
                continue;
            }

            x = x + dx[direct];
            y = y + dy[direct];
        }
        return (x == 0 && y == 0) || direct != 0;
    }
}