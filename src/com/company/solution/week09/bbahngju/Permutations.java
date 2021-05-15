package com.company.solution.week09.bbahngju;

import java.util.ArrayList;
import java.util.List;

//46
//O(N!)
public class Permutations {
    private static boolean[] visited;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        visited = new boolean[nums.length];

        dfs(nums, nums.length, cur, answer);
        return answer;
    }

    public static void dfs(int[] nums, int maxCnt, List<Integer> cur, List<List<Integer>> answer) {
        if(cur.size() == maxCnt) {
            answer.add(new ArrayList<>(cur));
            return;
        }

        for(int i = 0; i < maxCnt; i++) {
            if(!visited[i]) {
                visited[i] = true;
                cur.add(nums[i]);
                dfs(nums, maxCnt, cur, answer);
                cur.remove(cur.size()-1);
                visited[i] = false;
            }
        }
    }
}
