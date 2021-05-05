package com.company.solution.week03.orihehe;

import com.company.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

// 173
// O(N)
public class BSTIterator {

    private List<Integer> arr = new ArrayList<>();
    private int iter = 0;

    private void init(TreeNode root) {
        if (root == null) return;
        init(root.left);
        arr.add(root.val);
        init(root.right);
    }

    public BSTIterator(TreeNode root) {
        init(root);
    }

    public int next() {
        return arr.get(iter++);
    }

    public boolean hasNext() {
        return iter < arr.size();
    }
}
