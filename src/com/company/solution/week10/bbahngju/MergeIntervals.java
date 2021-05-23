package com.company.solution.week10.bbahngju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//56
//O(NlogN)
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> tmp = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o1 -> o1[0]));

        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
                continue;
            }

            tmp.add(new int[]{start, end});
            start = intervals[i][0];
            end = intervals[i][1];
        }
        tmp.add(new int[]{start, end});

        return tmp.toArray(new int[tmp.size()][]);
    }
}
