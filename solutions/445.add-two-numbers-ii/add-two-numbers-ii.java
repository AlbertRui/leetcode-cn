/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    ListNode tmp = new ListNode(0);
	    ListNode res = tmp;
	    l1 = reverse(l1);
	    l2 = reverse(l2);
	    int flag = 0;
	    int val = 0;
	    while (l1 != null || l2 != null) {
	        int a = l1 == null ? 0 : l1.val;
	        int b = l2 == null ? 0 : l2.val;
	        val = (a + b + flag) % 10;
	        flag = (a + b + flag) / 10;
	        tmp = tmp.next = new ListNode((val));
	        if (l1 != null) {
		        l1 = l1.next;
	        }
	        if (l2 != null) {
		        l2 = l2.next;
	        }
	    }
	    if(flag == 1) {
	        tmp.next = new ListNode(flag);
	    }
	    return reverse(res.next);
    }

    public ListNode reverse(ListNode head) {
	    ListNode next = null;
	    ListNode result = null;
	    while (head != null) {
	        next = head.next;
	        head.next = result;
	        result = head;
	        head = next;
	    }
	    return result;
    }
}