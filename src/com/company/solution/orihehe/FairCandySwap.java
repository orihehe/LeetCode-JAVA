package com.company.solution.orihehe;

import java.util.Arrays;

public class FairCandySwap {
    public int[] fairCandySwap(int[] A, int[] B) {
        Arrays.sort(B);
        int sum = 0;
        for (int value : A) sum += value;
        for (int value : B) sum -= value;

        sum/=2;
        for (int value : A) {
            int idx = Arrays.binarySearch(B, value - sum);
            if (idx >= 0) return new int[]{value, B[idx]};
        }
        return new int[]{};
    }
}
