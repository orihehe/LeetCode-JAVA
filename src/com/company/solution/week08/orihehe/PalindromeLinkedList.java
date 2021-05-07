package com.company.solution.week08.orihehe;

import com.company.common.ListNode;

// 234
// O(N)
public class PalindromeLinkedList {

    private final StringBuilder str = new StringBuilder();
    private final StringBuilder reverseStr = new StringBuilder();

    public boolean isPalindrome(ListNode head) {
        dfs(head);
        return str.toString().equals(reverseStr.toString());
    }

    private void dfs(ListNode cur) {
        if (cur == null) {
            return;
        }
        str.append(cur.val);
        dfs(cur.next);
        reverseStr.append(cur.val);
    }
}
