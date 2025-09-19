package Arrays;

public class NodeNode{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        LinkedListSolution solution = new LinkedListSolution();
        solution.printList(head);
       solution.printList(solution.reverseListIterative(head));



    }
    
}
