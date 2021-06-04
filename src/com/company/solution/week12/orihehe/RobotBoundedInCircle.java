package com.company.solution.week12.orihehe;

// 1041
// O(N)
public class RobotBoundedInCircle {

    int[] rgo = { 1, 0, -1, 0 };
    int[] cgo = { 0, 1, 0, -1 };

    public boolean isRobotBounded(String instructions) {
        int r = 0, c = 0, dir = 0;
        for (int mx = 0; mx < 4; mx++) {
            for (char i : instructions.toCharArray()) {
                switch (i) {
                    case 'G':
                        r += rgo[dir];
                        c += cgo[dir];
                        break;
                    case 'L':
                        dir = (dir + 3) % 4;
                        break;
                    case 'R':
                        dir = (dir + 1) % 4;
                        break;
                }
            }
            if (r == 0 && c == 0) return true;
        }
        return false;
    }
}
