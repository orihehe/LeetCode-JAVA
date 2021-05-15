package com.company.solution.week09.orihehe;

import java.util.ArrayList;
import java.util.List;

// 171
// O(N!)
public class ExcelSheetColumnNumber {

    private final List<List<Integer>> ans = new ArrayList<>();
    private final List<Integer> tmp = new ArrayList<>();

    private int n;
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        n = nums.length;
        used = new boolean[n];
        dfs(nums, 0);
        return ans;
    }

    private void dfs(int[] nums, int cur) {
        if (cur == n) {
            ans.add(new ArrayList<>() {{
                addAll(tmp);
            }});
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used[i]) continue;
            used[i] = true;
            tmp.add(nums[i]);
            dfs(nums, cur + 1);
            used[i] = false;
            tmp.remove(cur);
        }
    }
}
