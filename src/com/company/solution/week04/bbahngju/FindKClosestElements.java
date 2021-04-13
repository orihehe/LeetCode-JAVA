package com.company.solution.week04.bbahngju;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

//O(N)
class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int s, e;

        s = 0;
        e = k-1;
        while(e+1 < arr.length) {
            if(x-arr[s] > arr[e+1]-x) {
                s+=1;
                e+=1;
            }
            else break;
        }

        return CutArr(arr, s, e+1);
    }

    public List<Integer> CutArr(int[] arr, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for(int i=start; i<end; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
