/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        while(dummy.next != null) {
            if(dummy.next.val == val) 
                dummy.next = dummy.next.next;
            else dummy = dummy.next;
        }
        return p.next;
    }
}