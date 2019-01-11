/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    
    private Map<Integer, Integer> map = null;
    private Integer size = 0;

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution(ListNode head) {
        map = new HashMap<>();
        while(head != null) {
            map.put(size++, head.val);
            head = head.next;
        }
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        return map.get((int)(Math.random() * size));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */