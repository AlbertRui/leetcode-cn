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
    bool isPalindrome(ListNode* head) {
        ListNode *fast = head, *slow = head;
        while(fast && fast -> next) {
            fast = fast -> next -> next;
            slow = slow -> next;
        }
        slow = reverse(slow);
        fast = head;
        while(slow) {
            if(slow -> val != fast -> val) return false;
            slow = slow -> next;
            fast = fast -> next;
        }
        return true;
    }
private:
    ListNode* reverse(ListNode* head) {
        if(!head || !head -> next) return head;
        ListNode *res = reverse(head -> next);
        head -> next -> next = head;
        head -> next = NULL;
        return res;
    }
};