/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) 
            return head;
        ListNode ptr = head;
        int len = 1;
        while (ptr.next != null) {
            len++;
            ptr = ptr.next;
        }
        ptr.next = head;
        
        int optimizedLength = len - k % len;
        for (int i = 0; i < optimizedLength; i++) {
            ptr = ptr.next;
        }
        head = ptr.next;
        ptr.next = null;
        
        return head;
        
    }
}