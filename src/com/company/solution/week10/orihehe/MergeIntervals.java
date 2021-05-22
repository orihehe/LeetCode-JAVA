package com.company.solution.week10.orihehe;

import java.util.*;

// 56
// O(N)
public class MergeIntervals {

    private static final int MAX = 10001;

    public int[][] merge(int[][] intervals) {
        int[] startPoint = new int[MAX];
        int[] endPoint = new int[MAX];
        for (int[] interval : intervals) {
            int s = interval[0], e = interval[1];
            startPoint[s]++;
            endPoint[e]++;
        }
        List<int[]> ans = new ArrayList<>();
        int sum = 0, s = -1;
        for (int i = 0; i < MAX; i++) {
            sum += startPoint[i];
            if (sum != 0 && sum - startPoint[i] == 0) {
                s = i;
            }
            sum -= endPoint[i];
            if (sum == 0 && s != -1) {
                ans.add(new int[] {s, i});
                s = -1;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
