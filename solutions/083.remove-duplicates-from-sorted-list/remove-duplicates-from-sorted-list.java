/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode p_current = head;
        ListNode p_next = head.next;

        while (p_next != null) {
            if (p_current.val == p_next.val) {
                p_current.next = p_next.next;
            } else {
                p_current = p_current.next;
            }
            p_next = p_next.next;
        }
        return head;
    }
}