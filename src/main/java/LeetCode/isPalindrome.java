package LeetCode;

import Prefix.NumArray;

public class isPalindrome {


    public static void main(String[] args) {
        isPalindrome p = new isPalindrome();
        ListNode1 h1 = new ListNode1(1);
        h1.next = new ListNode1(2);
        h1.next.next = new ListNode1(2);
        h1.next.next.next = new ListNode1(1);
        System.out.println(p.isPalin(h1));


        ListNode1 h2 = new ListNode1(1);
        h2.next = new ListNode1(2);
        System.out.println(p.isPalin(h2)); // false

        // 1 → 2 → 3 → 2 → 1
        ListNode1 h3 = new ListNode1(1);
        h3.next = new ListNode1(2);
        h3.next.next = new ListNode1(3);
        h3.next.next.next = new ListNode1(2);
        h3.next.next.next.next = new ListNode1(1);
        System.out.println(p.isPalin(h3)); // true
    }

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
