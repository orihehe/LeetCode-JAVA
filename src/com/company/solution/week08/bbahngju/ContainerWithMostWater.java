package com.company.solution.week08.bbahngju;

//11
//O(N)
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        String mini;
        int result, answer = 0;

        while(left < right) {
            mini = height[left] <= height[right] ? "left" : "right";
            result = "left".equals(mini) ? (right - left) * height[left] : (right - left) * height[right];
            answer = Math.max(answer, result);

            if("left".equals(mini)) {
                left = findIdx(left, 1, height);
            }
            else {
                right = findIdx(right, -1, height);
            }
        }

        return answer;
    }

    public int findIdx(int idx, int dir, int[] height) {
        int i;
        int len = height.length;
        if(dir == 1) {
            for(i = idx; i < len; i++) {
                if(height[idx] < height[i]) break;
            }
        }
        else {
            for(i = idx; i >= 0; i--) {
                if(height[idx] < height[i]) break;
            }
        }

        return i;
    }
}
