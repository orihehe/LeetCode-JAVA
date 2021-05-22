package com.company.solution.week10.orihehe;

// 134
// O(N)
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int minVal = 10000000, minIdx = 0, hap = 0;

        for (int i = 0; i < gas.length; i++) {
            hap += gas[i] - cost[i];
            if (minVal > hap) {
                minVal = hap;
                minIdx = i;
            }
        }
        return hap < 0 ? -1 : (minIdx + 1) % gas.length;
    }
}
