package com.company.solution.week15.orihehe;

import java.util.regex.Pattern;

// 10
public class RegularExpressionMatching {

    public boolean isMatch(String s, String p) {
        return Pattern.matches("^" + p + "$", s);
    }
}
