package com.company.solution.week16.orihehe;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

// 12
// O(N)
public class IntegerToRoman {

    private final List<Pair<Integer, String>> roman;

    public IntegerToRoman() {
        roman = new ArrayList<>();
        roman.add(new Pair<>(1000, "M"));
        roman.add(new Pair<>(900, "CM"));
        roman.add(new Pair<>(500, "D"));
        roman.add(new Pair<>(400, "CD"));
        roman.add(new Pair<>(100, "C"));
        roman.add(new Pair<>(90, "XC"));
        roman.add(new Pair<>(50, "L"));
        roman.add(new Pair<>(40, "XL"));
        roman.add(new Pair<>(10, "X"));
        roman.add(new Pair<>(9, "IX"));
        roman.add(new Pair<>(5, "V"));
        roman.add(new Pair<>(4, "IV"));
        roman.add(new Pair<>(1, "I"));
    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (Pair<Integer, String> c : roman) {
            int cnt = num/c.getKey();
            for (int i = 0; i < cnt; i++) {
                sb.append(c.getValue());
            }
            num -= cnt * c.getKey();
        }
        return sb.toString();
    }
}
