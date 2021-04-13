package com.company.solution.week04.orihehe;

import java.util.ArrayList;
import java.util.List;

// 658
// O(N)
public class FindKClosestElements {

    private boolean isCloserThan(int a, int b, int x) {
        int absA = Math.abs(a - x), absB = Math.abs(b - x);
        if (absA == absB) return a < b;
        return absA < absB;
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while (r - l + 1 > k) {
            if (isCloserThan(arr[l], arr[r], x)) r--;
            else l++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) result.add(arr[i]);
        return result;
    }
}
