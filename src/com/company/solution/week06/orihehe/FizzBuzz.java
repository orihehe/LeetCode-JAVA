package com.company.solution.week06.orihehe;

import java.util.ArrayList;
import java.util.List;

// 412
// O(N)
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            ans.add(getValue(i));
        return ans;
    }

    private String getValue(int x) {
        if (x % 15 == 0) return "FizzBuzz";
        if (x % 3 == 0) return "Fizz";
        if (x % 5 == 0) return "Buzz";
        return Integer.toString(x);
    }
}
