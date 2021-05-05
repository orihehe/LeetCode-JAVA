package com.company.solution.week02.bbahngju;

import com.company.common.ListNode;

//O(N)
public class ReverseLinkedList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode preNode = head;
            ListNode curNode = null;
            ListNode nextNode = null;

            while(preNode != null) {
                nextNode = curNode;
                curNode = preNode;
                preNode = preNode.next;
                curNode.next = nextNode;
            }
            head = curNode;

            return head;
        }
    }
}
