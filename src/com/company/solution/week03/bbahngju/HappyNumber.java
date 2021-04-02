package com.company.solution.week03.bbahngju;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {
    class Solution {
        private Map<Integer, Boolean> hashMap = new HashMap<>();
        public boolean isHappy(int n) {
            int total;
            boolean happy = false;

            hashMap.put(n, true);
            while(true) {
                total = 0;
                while(n != 0) {
                    total += Math.pow(n%10, 2);
                    n /= 10;
                }
                if(total == 1) return true;
                if(isCycle(total)) return false;

                n = total;

            }
        }

        public boolean isCycle(int t) {
            if(hashMap.containsKey(t)) return true;

            hashMap.put(t, true);
            return false;
        }
    }
}
