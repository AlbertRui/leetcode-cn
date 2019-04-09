/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pre = null, fast = head, slow = head;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return merge(sortList(head), sortList(slow));
    }
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode moving = dummy;
        while(l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                moving.next = l1;
                l1 = l1.next;
            } else {
                moving.next = l2;
                l2 = l2.next;
            }
            moving = moving.next;
        }
        if(l1 != null) moving.next = l1;
        else moving.next = l2;
        return dummy.next;
    } 
}