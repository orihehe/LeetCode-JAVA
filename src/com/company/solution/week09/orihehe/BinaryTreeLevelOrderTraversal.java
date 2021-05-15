package com.company.solution.week09.orihehe;

import com.company.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 102
// O(N)
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;
    }

    private void dfs(TreeNode cur, List<List<Integer>> ret, int dep) {
        if (cur == null) return;
        if (ret.size() <= dep) ret.add(new ArrayList<Integer>());
        ret.get(dep).add(cur.val);
        dfs(cur.left, ret, dep + 1);
        dfs(cur.right, ret, dep + 1);
    }
}
