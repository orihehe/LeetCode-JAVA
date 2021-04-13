package com.company.solution.week04.bbahngju;

import java.util.HashMap;
import java.util.Map;

//O(N)
public class MajorityElement {
    static Map<Integer, Integer> counts;
    public int majorityElement(int[] nums) {
        counts = new HashMap<>();
        for(int num : nums) {
            if(counts.containsKey(num)) {
                counts.put(num, counts.get(num)+1);
                continue;
            }
            counts.put(num, 1);
        }
        return MaxCount();
    }

    public int MaxCount() {
        int idx = 0;
        int value = 0;
        for(int key : counts.keySet()) {
            if(counts.get(key) > value) {
                idx = key;
                value = counts.get(key);
            }
        }
        return idx;
    }
}
