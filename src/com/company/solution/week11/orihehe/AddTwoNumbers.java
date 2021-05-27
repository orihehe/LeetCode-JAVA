package com.company.solution.week11.orihehe;

import com.company.common.ListNode;

// 2
// O(N)
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int upper = 0;
        ListNode ans = new ListNode();
        ListNode tmp = ans;
        while (l1 != null || l2 != null) {
            int cur = upper;
            if (l1 != null) {
                cur += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                cur += l2.val;
                l2 = l2.next;
            }
            tmp.next = new ListNode(cur % 10);
            tmp = tmp.next;
            upper = cur / 10;

        }
        if (upper == 1) tmp.next = new ListNode(1);
        return ans.next;
    }
}
