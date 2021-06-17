package com.company.solution.week13.orihehe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// 384
public class ShuffleAnArray {

    List<Integer> original;
    List<Integer> cur;

    public ShuffleAnArray(int[] nums) {
        original = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());
        cur = new ArrayList<>(original);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original.stream()
                .mapToInt(x -> x)
                .toArray();
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Collections.shuffle(cur);
        return cur.stream()
                .mapToInt(x -> x)
                .toArray();
    }
}
