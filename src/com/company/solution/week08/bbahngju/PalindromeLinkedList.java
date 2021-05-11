package com.company.solution.week08.bbahngju;

import com.company.common.ListNode;

//234
//O(N)
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int[] save = new int[100000];
        ListNode search = head;
        int idx = 0;
        int left, right;
        boolean isAnswer = true;

        while(search != null) {
            save[idx] = search.val;
            search = search.next;
            idx++;
        }

        left = 0;
        right = idx-1;
        while(left <= right) {
            if(save[left] != save[right]) {
                isAnswer = false;
                break;
            }
            left++;
            right--;
        }

        return isAnswer;
    }
}
