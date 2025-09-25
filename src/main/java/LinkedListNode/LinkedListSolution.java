package LinkedListNode;

//1->2->3->4->5
//5->4->3->2->1
public class LinkedListSolution {
    public void printList(ListNode head){
        ListNode cur = head;
        while (cur != null){
            System.out.print(cur.val);
            if(cur.next !=null){
                System.out.print(" -> ");

            }
            cur = cur.next;

        }
        System.out.println(" --> null ");
    }
    public ListNode reverseListIterative(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        while (cur!= null){

            ListNode nextTemp = cur.next;//store next node
            cur.next = prev;//reverse link
            prev = cur;// move prev forward
            cur = nextTemp;//move cur forward
        }

        return prev;
    }


}
