package com.company.solution.week14.bbahngju;

//982
//O((N^2)+(2^16 * N)) = O(66536000)
public class TriplesWithBitwiseAndEqualToZero {
    int answer = 0;

    public int countTriplets(int[] nums) {
        int[] countTwoNum = new int[1 << 16];

        for(int first : nums) {
            for(int second : nums) {
                countTwoNum[first & second] += 1;
            }
        }

        for(int i = 0; i < countTwoNum.length; i++) {
            for(int third : nums) {
                if((i & third) == 0) {
                    answer += countTwoNum[i];
                }
            }
        }

        return answer;
    }
}
