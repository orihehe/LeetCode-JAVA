package com.company.solution.week11.bbahngju;

//371
//O(N), N is number of a&b != 1
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        return plus(a, b);
    }

    public int plus(int a, int b) {
        int tmp1, tmp2;

        if(b == 0) return a;
        tmp1 = a^b;
        tmp2 = (a&b) << 1;
        return plus(tmp1, tmp2);
    }
}
