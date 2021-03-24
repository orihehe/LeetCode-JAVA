package com.company.solution.week01.bbahngju;

import java.util.Arrays;

public class VerifyingAnAlienDictionary {
    public static void main(String[] arg) {
        String[] a = new String[]{"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String input = "zkgwaverfimqxbnctdplsjyohu";
        System.out.println(isAlienSorted(a, input));
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int[] alpha = new int[26];
        for(int i=0; i<26; i++) alpha[i] = 0;

        char[] dic = order.toCharArray();
        for(int i=1; i<=dic.length; i++) {
            alpha[dic[i-1]-'a'] = i;
        }
        System.out.println(Arrays.toString(alpha));
        for(int i=0; i<words.length-1; i++) {
            int minimum = Math.min(words[i].length(), words[i+1].length());
            boolean check = false;
            for(int j=0; j<minimum; j++) {
                char first = words[i].charAt(j);
                char second = words[i+1].charAt(j);
                if(first == second) continue;
                if(alpha[first-'a'] < alpha[second-'a']) {
                    check = true;
                    break;
                }
                if(alpha[first-'a'] > alpha[second-'a']) return false;
            }
            if(!check && words[i].length() > words[i+1].length())
                return false;
        }

        return true;
    }
}
