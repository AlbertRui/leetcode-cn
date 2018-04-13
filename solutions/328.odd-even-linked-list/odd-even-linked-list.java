/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null)
            return head;
	    ListNode tmpOdd = head;
	    ListNode tmpEven = head.next;
	    ListNode even = tmpEven;
	    ListNode current = tmpEven.next;
	    boolean isOdd = true;
	    while (current != null) {
	        if (isOdd)
		        tmpOdd = tmpOdd.next = current;
	        else
		        tmpEven = tmpEven.next = current;
	        current = current.next;
	        isOdd = !isOdd;
	    }
	    tmpEven.next = null;
	    tmpOdd.next = even;
	    return head;
    }
}