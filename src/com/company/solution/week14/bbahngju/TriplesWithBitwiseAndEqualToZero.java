package com.company.solution.week14.bbahngju;

//982
public class TriplesWithBitwiseAndEqualToZero {
    private int answer = 0;

    public int countTriplets(int[] nums) {
        permutation(0, (int)Math.pow(2,16)-1, nums);
        return answer;
    }

    public void permutation(int idx, int andBit, int[] nums) {
        if(idx == 3) {
            if(andBit == 0)
                answer++;
            return;
        }

        for (int num : nums) {
            permutation(idx + 1, andBit & num, nums);
        }
    }
}
