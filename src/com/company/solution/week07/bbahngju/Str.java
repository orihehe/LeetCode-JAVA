package com.company.solution.week07.bbahngju;

//28
//O(N)
public class Str {
    public int strStr(String haystack, String needle) {
        boolean isFind;
        int i;

        if(haystack.length() < needle.length()) return -1;
        if(needle.equals("")) return 0;

        for(i=0; i<=(haystack.length()-needle.length()); i++) {
            if(haystack.charAt(i) == needle.charAt(0)) {
                isFind = isEquals(i+1, haystack, needle);
                if(isFind) break;
            }
        }

        if(i>haystack.length()-needle.length()) return -1;
        else return i;
    }

    public boolean isEquals(int firIdx, String first, String second) {
        for(int i=1; i<second.length(); i++) {
            if(first.charAt(firIdx) != second.charAt(i))
                return false;
            firIdx++;
        }

        return true;
    }
}
