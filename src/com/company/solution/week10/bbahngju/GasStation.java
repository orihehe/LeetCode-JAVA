package com.company.solution.week10.bbahngju;

//134
//O(N^2)
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i = 0; i < gas.length; i++) {
            if(gas[i] - cost[i] < 0) continue;

            if(isTravel(i, gas, cost))
                return i;
        }

        return -1;
    }

    public boolean isTravel(int i, int[] gas, int[] cost) {
        int cur = gas[i] - cost[i];

        int idx = (i + 1) % gas.length;
        while(idx != i) {
            cur += gas[idx];
            cur = cur - cost[idx];
            if(cur < 0) break;

            idx = (idx + 1) % gas.length;
        }

        return cur >= 0;
    }
}
