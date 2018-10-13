/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummyHead = new ListNode(0), p = head;
        dummyHead.next = head;
        while(p.next != null) { 
            if(p.val < p.next.val) p = p.next;
            else {
                ListNode temp = p.next, q = dummyHead;
                p.next = p.next.next;
                while(q.next.val < temp.val) q = q.next;
                temp.next = q.next;
                q.next = temp;
            }
        } 
        return dummyHead.next;
    }
}