package com.company.solution.week06.orihehe;

import com.company.common.ListNode;

// 21
// O(N)
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ans = head;

        while (l1 != null) {
            while (l2 != null && l1.val > l2.val) {
                head.next = new ListNode(l2.val);
                head = head.next;
                l2 = l2.next;
            }
            head.next = new ListNode(l1.val);
            head = head.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            head.next = new ListNode(l2.val);
            head = head.next;
            l2 = l2.next;
        }

        return ans.next;
    }
}
