package com.company.solution.week03.bbahngju;

import com.company.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class BinarySearchTreeIterator {
    static Queue<Integer> q = new LinkedList<>();
    public BinarySearchTreeIterator(TreeNode root) {
        Inorder(root);
    }

    public void Inorder(TreeNode root) {
        if(root == null) return;

        Inorder(root.left);
        q.add(root.val);
        Inorder(root.right);
    }

    public int next() {
        return q.poll();
    }

    public boolean hasNext() {
        return !q.isEmpty();
    }
}
