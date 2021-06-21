package com.company.solution.week14.orihehe;

import com.company.common.TreeNode;

import java.util.*;

// 101
// O(N)
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        List<Integer> lSubTree = new ArrayList<>();
        List<Integer> rSubTree = new ArrayList<>();
        leftFirstDfs(lSubTree, root.left);
        rightFirstDfs(rSubTree, root.right);
        return lSubTree.equals(rSubTree);
    }

    private void leftFirstDfs(List<Integer> arr, TreeNode cur) {
        if (cur == null) {
            arr.add(null);
            return;
        }
        arr.add(cur.val);
        leftFirstDfs(arr, cur.left);
        leftFirstDfs(arr, cur.right);
    }

    private void rightFirstDfs(List<Integer> arr, TreeNode cur) {
        if (cur == null) {
            arr.add(null);
            return;
        }
        arr.add(cur.val);
        rightFirstDfs(arr, cur.right);
        rightFirstDfs(arr, cur.left);
    }
}
