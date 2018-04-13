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
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        int flag = 0;
        int val = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            val = (val1 + val2 + flag) % 10;
            flag = (val1 + val2 + flag) / 10;//只有0和1两种结果
            temp = temp.next = new ListNode(val);
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        if (flag == 1) 
            temp.next = new ListNode(1);
        return res.next;
    }
    
}