package com.company.solution.week13.bbahngju;

import java.util.Arrays;
import java.util.Collections;

//384
//O(N)
public class ShuffleAnArray {
    public int[] answer;
    public Integer[] shuff;
    public ShuffleAnArray(int[] nums) {
        answer = nums;
        shuff = Arrays.stream(nums).boxed().toArray(Integer[]::new);
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return answer;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        Collections.shuffle(Arrays.asList(shuff));
        return Arrays.stream(shuff).mapToInt(i->i).toArray();
    }
}
