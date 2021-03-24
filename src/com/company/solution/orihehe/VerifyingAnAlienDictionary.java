package com.company.solution.orihehe;

public class VerifyingAnAlienDictionary {
    private int getOrderIndex(char c, String order) {
        int sz = 26;
        for(int i=0;i<sz;i++) {
            if(c == order.charAt(i)) return i;
        }
        return -1;
    }

    private boolean cmp(String A, String B, String order) {
        int sz = Math.min(A.length(), B.length());
        for(int i=0;i<sz;i++) {
            if (A.charAt(i) == B.charAt(i)) continue;
            return getOrderIndex(A.charAt(i), order) <= getOrderIndex(B.charAt(i),order);
        }
        return A.length() <= B.length();
    }

    public boolean isAlienSorted(String[] words, String order) {
        int sz = words.length;
        for(int i=0;i<sz-1;i++) {
            String A = words[i];
            String B = words[i+1];
            if (!cmp(A, B, order)) return false;
        }
        return true;
    }
}
