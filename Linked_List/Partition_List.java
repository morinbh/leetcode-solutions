/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) return head;
        //heads
        ListNode lessThenXhead = new ListNode(0);
        ListNode xOrGreaterHead = new ListNode(0);

        //pointers
        ListNode tempLess = lessThenXhead;
        ListNode tempGreater = xOrGreaterHead;

        while( head != null){
                if(head.val < x){
                     tempLess.next = head;
                     tempLess = tempLess.next;
                }
                else {
                    tempGreater.next = head;
                    tempGreater = tempGreater.next;
                }
             
            head = head.next;
        }
        tempGreater.next = null;
        tempLess.next =xOrGreaterHead.next;  ;
       

        return lessThenXhead.next;
    }
}
