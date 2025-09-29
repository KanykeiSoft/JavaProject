package LeetCode;

import Prefix.NumArray;

public class isPalindrome {

    public boolean isPalin(ListNode1 head){
        if (head == null || head.next == null) return true;

        ListNode1 slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        ListNode1 sec = reverse(slow);
        ListNode1 first = head;
        ListNode1 second = sec;
        boolean isPalindrome = true;
        while (second != null){
            if(first.val != second.val){
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        reverse(sec);
        return isPalindrome;


    }
    public ListNode1 reverse(ListNode1 head){
        ListNode1 prev = null,  curr = head;
        while (curr != null){
            ListNode1 next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;


        }
        return prev;
    }
}
