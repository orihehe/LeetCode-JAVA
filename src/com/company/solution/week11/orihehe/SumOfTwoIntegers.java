package com.company.solution.week11.orihehe;

import java.math.BigInteger;

// 371
// O(N)
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        BigInteger A = new BigInteger(String.valueOf(a));
        BigInteger B = new BigInteger(String.valueOf(b));
        return A.add(B).intValue();
    }
}
