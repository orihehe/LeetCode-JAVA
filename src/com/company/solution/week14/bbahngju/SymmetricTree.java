package com.company.solution.week14.bbahngju;

import com.company.common.TreeNode;

//101
//O(N)
public class SymmetricTree {
    private String leftAnswer = "";
    private String rightAnswer = "";

    public boolean isSymmetric(TreeNode root) {
        rootLeftRight(root.left);
        rootRightLeft(root.right);

        return leftAnswer.equals(rightAnswer);
    }

    public void rootLeftRight(TreeNode root) {
        if(root == null) {
            leftAnswer += "null";
            return;
        }

        leftAnswer += root.val;
        rootLeftRight(root.left);
        rootLeftRight(root.right);
    }

    public void rootRightLeft(TreeNode root) {
        if(root == null) {
            rightAnswer += "null";
            return;
        }

        rightAnswer += root.val;
        rootRightLeft(root.right);
        rootRightLeft(root.left);
    }
}
