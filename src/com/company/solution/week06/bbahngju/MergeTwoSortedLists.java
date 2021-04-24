package com.company.solution.week06.bbahngju;
import com.company.solution.week06.common.ListNode;

//21
//O(N)
public class MergeTwoSortedLists {
    private ListNode head = null;
    private ListNode last;

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;

        while(first != null && second != null) {
            if(first.val <= second.val) {
                insertNode(first.val);
                first = first.next;
            }
            else {
                insertNode(second.val);
                second = second.next;
            }
        }
        while(first != null) {
            insertNode(first.val);
            first = first.next;
        }
        while(second != null) {
            insertNode(second.val);
            second = second.next;
        }

        return head;
    }

    public void insertNode(int value) {
        ListNode newNode = new ListNode(value, null);

        if(head == null) {
            head = newNode;
            last = head;
        }
        else {
            while(last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }
}
