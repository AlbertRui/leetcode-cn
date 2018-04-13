/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode root, int k) {
	    ListNode[] list = new ListNode[k];
	    int len = 0;
	    ListNode cursor = root;
	    int base = 0;
	    int leftover = 0;
	    while (cursor != null) {
	        cursor = cursor.next;
	        len++;
	    }
	    base = len / k;
	    leftover = len % k;
	    cursor = root;
	    for (int i = 0; i < k; i++) {
	        list[i] = cursor; 
	        ListNode tail = null;
	        int groupSize = base;
	        if (leftover > 0) {
		        groupSize++;
		        leftover--;
	        }
	        for (int j = 0; j < groupSize; j++) {
		        if (j == groupSize - 1)
		            tail = cursor;
		        cursor = cursor.next;
	        }
	        if (groupSize > 0)
		        tail.next = null;
	    }
	    return list;
    }
}