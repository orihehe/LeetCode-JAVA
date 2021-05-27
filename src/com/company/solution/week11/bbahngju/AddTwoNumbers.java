package com.company.solution.week11.bbahngju;

import com.company.common.ListNode;

import java.util.LinkedList;
import java.util.Queue;

//2
//O(N)
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> result = new LinkedList<>();

        ListNode newNode, tmp = null;
        ListNode answer = null;

        ListNode list1 = l1;
        ListNode list2 = l2;

        int up = 0;
        int n1, n2, plus;
        while(list1 != null && list2 != null) {
            n1 = list1.val;
            n2 = list2.val;

            plus = n1 + n2 + up;
            up = plus / 10;
            result.add(plus % 10);

            list1 = list1.next;
            list2 = list2.next;
        }

        while(list1 != null) {
            n1 = list1.val;
            plus = n1 + up;
            up = plus / 10;
            result.add(plus % 10);

            list1 = list1.next;
        }

        while(list2 != null) {
            n1 = list2.val;
            plus = n1 + up;
            up = plus / 10;
            result.add(plus % 10);

            list2 = list2.next;
        }

        if(up != 0) result.add(up);

        while(!result.isEmpty()) {
            newNode = new ListNode(result.poll(), null);

            if(answer == null) {
                answer = newNode;
                tmp = answer;
                continue;
            }

            tmp.next = newNode;
            tmp = tmp.next;
        }

        return answer;
    }
}
