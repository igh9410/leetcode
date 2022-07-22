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
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode leftList = new ListNode(0); // left list saves values less than x
        ListNode rightList = new ListNode(0); // right list saves values grater or equal to x
        
        ListNode leftLink = leftList;
        ListNode rightLink = rightList;
        
        while (head != null) {
            if (head.val < x) {
                leftLink.next = head;
                leftLink = leftLink.next;
            }
            else {
                rightLink.next = head;
                rightLink = rightLink.next;
                
            }
            head = head.next;
        }
        leftLink.next = rightList.next;
        rightLink.next = null;
        
        return leftList.next;
    }
}