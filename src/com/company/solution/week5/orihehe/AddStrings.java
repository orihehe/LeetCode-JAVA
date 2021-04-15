package com.company.solution.week5.orihehe;

import java.math.BigInteger;

// 415
// O(N)
public class AddStrings {

    public String addStrings(String num1, String num2) {
        BigInteger A = new BigInteger(num1);
        BigInteger B = new BigInteger(num2);

        return A.add(B).toString();
    }
}
