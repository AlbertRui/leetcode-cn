/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* partition(ListNode* head, int x) {
        ListNode lessHead = ListNode(0);
        ListNode moreHead = ListNode(0);
        ListNode *p = &lessHead;
        ListNode *q = &moreHead;
        while(head) {
            if(head -> val < x) {
                p -> next = head;
                p = p -> next;
            } else {
                q -> next = head;
                q = q -> next;
            }
            head = head -> next;
        }
        p -> next = moreHead.next;
        q -> next = NULL;
        return lessHead.next;
    }
};