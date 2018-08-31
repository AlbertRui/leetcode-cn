/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fp = head, sp = head;
        while(fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp) break;
        }
        if(fp == null || fp.next == null) return null;
        sp = head;
        while(fp != sp) {
            sp = sp.next;
            fp = fp.next;
        }
        return sp;
    }
}