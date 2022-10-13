/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
            ListNode cursor = node;
        cursor.val = cursor.next.val;
        cursor.next = cursor.next.next;
    }
}