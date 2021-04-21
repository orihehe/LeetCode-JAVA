package com.company.solution.week05.bbahngju;
import com.company.solution.week05.common.ListNode;

//160
//O(N)
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int dif = Len(headA) - Len(headB);

        if(dif > 0) {
            for(int i=0; i<dif; i++)
                headA = headA.next;
        }
        else if(dif < 0) {
            for(int i=dif; i<0; i++)
                headB = headB.next;
        }
        while(headA != null && headB!= null && headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    public int Len(ListNode h) {
        int len=0;
        while(h != null) {
            len++;
            h = h.next;
        }

        return len;
    }
}
