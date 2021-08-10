package com.company.solution.week16.bbahngju;

import java.util.HashMap;
import java.util.Map;

//12
//O(N)
public class IntegerToRoman {
    private final Map<Integer, String> romanNumerals;

    public IntegerToRoman() {
        romanNumerals = new HashMap<>();

        romanNumerals.put(1, "I"); romanNumerals.put(5, "V");
        romanNumerals.put(10, "X"); romanNumerals.put(50, "L");
        romanNumerals.put(100, "C"); romanNumerals.put(500, "D");
        romanNumerals.put(1000, "M");

        romanNumerals.put(4, "IV"); romanNumerals.put(9, "IX");
        romanNumerals.put(40, "XL"); romanNumerals.put(90, "XC");
        romanNumerals.put(400, "CD"); romanNumerals.put(900, "CM");
    }

    public String intToRoman(int num) {
        StringBuilder answer = new StringBuilder();
        int placeValue = 1;
        while(num != 0) {
            int cur = (num % 10) * placeValue;
            if(romanNumerals.containsKey(cur)) {
                answer.insert(0, romanNumerals.get(cur));
            }
            else {
                answer.insert(0, calculate(cur, placeValue));
            }

            num /= 10;
            placeValue *= 10;
        }

        return answer.toString();
    }

    public StringBuilder calculate(int cur, int placeValue) {
        StringBuilder result = new StringBuilder();
        int cnt;
        int standard;

        standard = 5 * placeValue;
        cnt = cur / standard;
        for(int i = 0; i < cnt; i++) {
            result.append(romanNumerals.get(standard));
        }
        cur -= cur / standard;

        standard = placeValue;
        cnt = cur / standard;
        for(int i = 0; i < cnt; i++) {
            result.append(romanNumerals.get(standard));
        }

        return result;
    }

}
