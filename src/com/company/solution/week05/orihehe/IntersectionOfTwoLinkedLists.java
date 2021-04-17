package com.company.solution.week05.orihehe;

import com.company.solution.week05.common.ListNode;

// 160
// the love
// O(N)
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int numA = 0;
        int numB = 0;
        ListNode tmpA = headA;
        ListNode tmpB = headB;

        while (tmpA != null) {
            tmpA = tmpA.next;
            numA++;
        }
        while (tmpB != null) {
            tmpB = tmpB.next;
            numB++;
        }

        while (numA > numB) {
            numA--;
            headA = headA.next;
        }
        while (numB > numA) {
            numB--;
            headB = headB.next;
        }

        while (headA != null) {
            if (headA == headB) return headA;

            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
