package com.company.solution.week02.orihehe;


import com.company.common.ListNode;

import java.util.ArrayList;
import java.util.List;

// 206
// O(N)
public class ReverseLinkedList {

    private void solve(List<Integer> l, ListNode head) {
        if (head == null) return;
        solve(l, head.next);
        l.add(head.val);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        List<Integer> values = new ArrayList<>();
        solve(values, head);

        ListNode ansHead = new ListNode(values.get(0));
        ListNode cur = ansHead;
        for (int i=1; i<values.size(); i++) {
            cur.next = new ListNode(values.get(i), null);
            cur = cur.next;
        }

        return ansHead;
    }
}
