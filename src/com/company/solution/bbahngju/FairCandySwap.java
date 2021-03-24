package com.company.solution.bbahngju;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] arg) {
        int[] a = new int[]{1,2,5};
        int[] b = new int[]{2,4};

        int[] result = fairCandySwap(a, b);
        System.out.println(Arrays.toString(result));
    }
    public static int[] fairCandySwap(int[] A, int[] B) {
        int totalA = 0, totalB = 0;
        for(int i=0; i<A.length; i++) {
            totalA += A[i];
        }
        for(int i=0; i<B.length; i++) {
            totalB += B[i];
        }
        int gap = Math.abs(totalA-totalB);
        if(totalA > totalB) {
            int[] result = exchange(A, B, gap/2);
            return new int[]{result[0], result[1]};
        }
        else {
            int[] result = exchange(B, A, gap/2);
            return new int[]{result[1], result[0]};
        }
    }

    public static int[] exchange(int[] big, int[] small, int diff) {
        for(int i=0; i<big.length; i++) {
            for(int j=0; j<small.length; j++) {
                if(big[i] - small[j] == diff) return new int[]{big[i], small[j]};
            }
        }
        return new int[]{0,0};
    }
}
